package com.PicturePals.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

// If collection does not exist MongoDB will create it automatically
@Document(collection = "review")

// Using lombok we can automatically set constructors and data
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private ObjectId id;

    private String body;

    Review(String body){
        this.body = body;
    }

}
