package com.codebase.bookstore;

import com.codebase.bookstore.models.Book;
import com.codebase.bookstore.repositories.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private BookRepository bookRepository;

    @Test
    public void testGetAllBooks_ShouldReturn200OK() throws Exception {
        List<Book> books = Arrays.asList(new Book("Book1", "Author1"), new Book("Book2", "Author2"));
        given(bookRepository.findAll()).willReturn(books);

        mockMvc.perform(get("/books")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[*].id").isNotEmpty());
    }

    @Test
    public void testGetValidBook_ShouldReturn200OK() throws Exception {
        Book expectedBook = new Book("Book1", "Author1");
        expectedBook.setId(1L);
        given(bookRepository.findById(1L)).willReturn(Optional.of(expectedBook));

        mockMvc.perform(get("/books/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Book1"))
                .andExpect(jsonPath("$.author").value("Author1"));

    }

    @Test
    public void testGetNonExistentBook_Returns404NotFound() throws Exception {
        mockMvc.perform(get("/books/99999"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testCreateBook_ShouldReturn201Created() throws Exception {
        Book newBook = new Book("NewBook", "NewAuthor");
        given(bookRepository.save(Mockito.any(Book.class))).willReturn(newBook);

        mockMvc.perform(post("/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(newBook)))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.title").value("NewBook"))
                .andExpect(jsonPath("$.author").value("NewAuthor"));

    }
}
