package com.example.airbnbapi.repository;

import com.example.airbnbapi.model.Film;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmRepository extends MongoRepository<Film,String> {

}
