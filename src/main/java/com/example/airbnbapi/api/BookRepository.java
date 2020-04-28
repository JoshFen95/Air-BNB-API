package com.example.airbnbapi.api;

import com.example.airbnbapi.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String> {

}
