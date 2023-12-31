package com.example.faf.faf.controllers;

import com.example.faf.faf.models.Folder;
import com.example.faf.faf.models.Person;
import com.example.faf.faf.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "folders")
    public ResponseEntity<Folder> createFolder(@RequestBody Folder folder){
        return new ResponseEntity<>( folderRepository.save(folder), HttpStatus.OK);
    }

    @DeleteMapping(value = "/folders/{id}")
    public void deleteFolder(@PathVariable Long id){
        folderRepository.deleteById(id);
    }

    @PutMapping(value = "/folders/{id}")
    public Folder editFolder(@PathVariable Long id,@RequestBody Folder newFolder){
        return folderRepository.findById(id).map(folder -> {
            folder.setPerson(newFolder.getPerson());
            folder.setTitle(newFolder.getTitle());
            folder.setFiles(newFolder.getFiles());
            return folderRepository.save(newFolder);
        }).orElseGet(() -> {
            newFolder.setId(id);
            return folderRepository.save(newFolder);
        });
    }
}


