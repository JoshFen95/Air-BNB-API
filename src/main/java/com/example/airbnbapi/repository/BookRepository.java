package com.example.airbnbapi.repository;

import com.example.airbnbapi.model.Book;
import com.example.airbnbapi.model.MediaType;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MediaRepository<Book> {

    @Override
    default MediaType getMediaType() {
        return MediaType.BOOK;
    }

}
