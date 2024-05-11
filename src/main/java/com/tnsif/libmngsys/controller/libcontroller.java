package com.tnsif.libmngsys.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tnsif.libmngsys.entity.Library;
import com.tnsif.libmngsys.service.LibService;

@RestController
public class libcontroller {
	
	@Autowired
	private LibService libService;
	@PostMapping("/api/library")
	public Library addBooks(@RequestBody Library library) {
		return libService.addBooks(library);		
	}
	@GetMapping("/getLibBooks/{id}")
	public Library searchLibBookstById(@PathVariable Long id) {
		return libService.searchLibBookById(id);
	}
	@GetMapping("/getLibBooks")
	public List<Library> getBooks() {
		return libService.getBooks();
	}
	
	@DeleteMapping("/deleteLibBooks/{id}")
	public void deleteBooks(@PathVariable Long id) {
		libService.deleteLibBooks(id);
	}	
	@PutMapping("/updateBooks")
	public Library updateBooks(@RequestBody Library library) {
		return libService.updateLibBooks(library);
		
	}
}
