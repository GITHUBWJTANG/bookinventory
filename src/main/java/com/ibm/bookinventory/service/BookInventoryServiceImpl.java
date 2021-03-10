package com.ibm.bookinventory.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bookinventory.model.BookData;
import com.ibm.bookinventory.repo.BookInventoryRepo;

@Service
public class BookInventoryServiceImpl implements BookInventoryService {

	@Autowired
	private BookInventoryRepo bookInventoryRepo;

	public BookInventoryServiceImpl() {
	}

	public BookData getBook(String isbn) {

		BookData book = this.bookInventoryRepo.findByIsbn(isbn);

		return book;
	}

	public Collection<BookData> getBooks() {

		Collection<BookData> books = this.bookInventoryRepo.findAll();
		return books;
	}
}