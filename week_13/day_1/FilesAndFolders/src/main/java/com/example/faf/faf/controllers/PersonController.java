package com.example.faf.faf.controllers;

import com.example.faf.faf.models.Person;
import com.example.faf.faf.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return new ResponseEntity<>( personRepository.save(person), HttpStatus.OK);
    }

    @DeleteMapping(value = "/persons/{id}")
    public void deletePerson(@PathVariable Long id){
         personRepository.deleteById(id);
    }

    @PutMapping(value = "/persons/{id}")
    public Person editPerson(@PathVariable Long id,@RequestBody Person newPerson){
        return personRepository.findById(id).map(person -> {
            person.setName(newPerson.getName());
            person.setFolders(newPerson.getFolders());
            return personRepository.save(person);
        }).orElseGet(() -> {
            newPerson.setId(id);
            return personRepository.save(newPerson);
        });
    }
}
