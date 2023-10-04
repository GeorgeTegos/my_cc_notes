package com.example.faf.faf.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "folders")
    @OneToMany(mappedBy = "person") // refers to person attribute in Folder model
    @JsonIgnoreProperties({"person"})
    private List<Folder> folders;


    public Person(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public Person(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return this.folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder){
        this.getFolders().add(folder);
    }

}
