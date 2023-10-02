package com.example.faf.faf;

import com.example.faf.faf.models.File;
import com.example.faf.faf.models.Folder;
import com.example.faf.faf.models.Person;
import com.example.faf.faf.repositories.FileRepository;
import com.example.faf.faf.repositories.FolderRepository;
import com.example.faf.faf.repositories.PersonRepository;
import org.aspectj.lang.annotation.Before;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class FilesAndFoldersApplicationTests {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	private Person person;
	private Folder folder;
	private Folder folder2;
	private File file1;
	private File file2;

	@Test
	void contextLoads() {
	}


	@Test
	public void addFolderToPerson(){
		person = new Person("George");
		folder = new Folder("Desktop",person);
		personRepository.save(person);
		ArrayList<Folder> list = new ArrayList<>();
		list.add(folder);
		person.setFolders(list);
		folderRepository.save(folder);
	}

	@Test
	public void addFilesToFolder(){
		person = new Person("George");
		folder = new Folder("Desktop",person);
		folder2 = new Folder("Documents",person);
		person.addFolder(folder2);
		personRepository.save(person);
		folderRepository.save(folder);
		folderRepository.save(folder2);




		file1 = new File("photo","JPEG",3,folder);
		fileRepository.save(file1);
		file2 = new File("background","JPEG",2,folder2);
		fileRepository.save(file2);



	}
}
