package com.PicturePals.Movies;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// For Getter and setter method we use Lombok framework where it automatically sets and gets without showing code
@Data
// This class is directly linked with collection in MongoDB database
@Document(collection =  "Movies")
public class Movie {

    @Id
    private ObjectId id;

    private String  imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private List<String> genres;

    private String poster;

    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;

}

