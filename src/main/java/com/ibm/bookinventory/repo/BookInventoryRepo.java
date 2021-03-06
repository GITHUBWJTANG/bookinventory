package com.ibm.bookinventory.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ibm.bookinventory.model.BookData;

@Repository
public interface BookInventoryRepo extends MongoRepository<BookData, Long> {

	public BookData findByIsbn(String isbn);
}