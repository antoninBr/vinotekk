package fr.brugnot.vinotekk.repository.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Year;

@Data
public class Wine extends MongoEntity {

    private String label;

    private String domain;

    private Year year;

    @DBRef
    private WineEstate wineEstate;
}
