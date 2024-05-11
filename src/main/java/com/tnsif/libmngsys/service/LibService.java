package com.tnsif.libmngsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tnsif.libmngsys.entity.Library;
import com.tnsif.libmngsys.repo.LibRepo;

@Service
public class LibService {
	
	@Autowired
	private LibRepo libRepo;
	
	// Adding Books - Post Operations 
	
	public Library addBooks(Library library) {
		return libRepo.save(library);
	}
	
	// Retrieving All Books
	
		public List<Library> getBooks() {
			return (List<Library>) libRepo.findAll();		
		}
	
	// Retrieving Books using ID
	public Library searchLibBookById(long id) {
		return libRepo.findById(id).get();
		
	}
	// Delete Books using ID
	
	public void deleteLibBooks(long id) {
		libRepo.deleteById(id);
	}
	
	// Updating Book Details using id
	
	public Library updateLibBooks(Library library) {
		Long Id = library.getId();
		Library lib = libRepo.findById(Id).get();
		lib.setTitle(library.getTitle());
		lib.setAuthor(library.getAuthor());
		lib.setIsbn(library.getIsbn());
		lib.setGenre(library.getGenre());
		lib.setPublication_year(library.getPublication_year());
		
		return libRepo.save(lib);
	}
	
	
}