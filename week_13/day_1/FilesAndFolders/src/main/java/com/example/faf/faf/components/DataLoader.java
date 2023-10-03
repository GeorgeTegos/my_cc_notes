package com.example.faf.faf.components;

import com.example.faf.faf.models.File;
import com.example.faf.faf.models.Folder;
import com.example.faf.faf.models.Person;
import com.example.faf.faf.repositories.FileRepository;
import com.example.faf.faf.repositories.FolderRepository;
import com.example.faf.faf.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader(){}

    public void run(ApplicationArguments args){

        Person george = new Person("George");
        personRepository.save(george);

        Person nick = new Person("Nick");
        personRepository.save(nick);

        Person anna = new Person("Anna");
        personRepository.save(anna);

        Folder desktop = new Folder("Desktop",george);
        folderRepository.save(desktop);

        Folder documents = new Folder ("Documents",george);
        folderRepository.save(documents);

        Folder pictures = new Folder("Pictures",anna);
        folderRepository.save(pictures);

        Folder games = new Folder("Games",nick);
        folderRepository.save(games);

        Folder exams = new Folder("Exams",nick);
        folderRepository.save(exams);


        File file1 = new File("photo","JPEG",3,pictures);
        fileRepository.save(file1);

        File file2 = new File("background","JPEG",2,pictures);
        fileRepository.save(file2);

        File file3 = new File ("GTA","exe",100,games);
        fileRepository.save(file3);

        File file4 = new File("VSCode","exe",20,desktop);
        fileRepository.save(file4);

        File file5 = new File("math","doc",5,exams);
        fileRepository.save(file5);

        File file6 = new File("Contract", "pdf", 2, documents);
        fileRepository.save(file6);

    }
}
