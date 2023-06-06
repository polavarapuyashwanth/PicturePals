package com.PicturePals.Movies;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
// Here MongoRepository is built in spring boot interface which will give all the method like get, find etc.
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
