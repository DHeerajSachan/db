package com.mongo.db.mongorepo;

import com.mongo.db.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}
