package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.domain.Book;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String Hello() {
		return "Welcomt to US";
	}

	@GetMapping("/exposed/getBooks")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1, "TruthEternal", 23.45));
	}


}
