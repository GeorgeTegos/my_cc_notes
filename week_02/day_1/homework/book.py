from author import Author
from publisher import Publisher

class Book:
    
    def __init__(self,name,type_of_book,author,publisher):
        self.name = name
        self.type = type_of_book
        self.author = author
        self.publisher = publisher

    def informations(self):
        return ("The Books name is " +self.name+
                "\nThe Author of the book is "+self.author+
                "\nThe type of the book is"+self.type+
                "\nThe publisher of the book is "+self.publisher)
    
    def description_of_the_book (self):
        Author.write_book_description()
        pass

    def buy_the_book(self):
        Publisher.selling_locations()
        pass
    
    def table_of_contents(self):
        Author.write_book_table_of_content()
        pass



book_one = Book("The India Story","type one","Bimal Jalal","Rupa Publications India"),
book_two = Book("Listen to Your Heart: The London Adventure","type two","Ruskin Bond","Penguin")
book_three = Book("Business of Sports","type one","Vinit Karnik","Popular Prakashan")
book_four = Book("A Place Called Home","type one","Preeti Shenoy","publisher someone")
book_five = Book("Modi @20: Dreams Meeting Delivery","type two","VP Venkaiah Naidu",
                 "Rupa Publications India")

# list_of_books = [book_one,book_two,book_three,book_four,book_five]

print(Book.informations(book_five))
print("#"*42)
author_one = Author("Bimal Jalal",33,"India")
print(author_one.author_informations())
# print(Author.author_informations(book_five))






