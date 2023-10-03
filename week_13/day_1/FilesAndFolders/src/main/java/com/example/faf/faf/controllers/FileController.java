package com.example.faf.faf.controllers;

import com.example.faf.faf.models.File;
import com.example.faf.faf.models.Person;
import com.example.faf.faf.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "files")
    public ResponseEntity<File> createFile(@RequestBody File file){
        return new ResponseEntity<>( fileRepository.save(file), HttpStatus.OK);
    }

    @DeleteMapping(value = "/files/{id}")
    public void deleteFile(@PathVariable Long id){
        fileRepository.deleteById(id);
    }

    @PutMapping(value = "/files/{id}")
    public File editFile(@PathVariable Long id,@RequestBody File newFile){
        return fileRepository.findById(id).map(file -> {
            file.setName(newFile.getName());
            file.setExtension(newFile.getExtension());
            file.setFolder(newFile.getFolder());
            file.setSize(newFile.getSize());
            return fileRepository.save(file);
        }).orElseGet(() -> {
            newFile.setId(id);
            return fileRepository.save(newFile);
        });
    }
}


