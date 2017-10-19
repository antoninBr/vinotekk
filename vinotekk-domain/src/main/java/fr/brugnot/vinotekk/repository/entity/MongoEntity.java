package fr.brugnot.vinotekk.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class MongoEntity {

    @Id
    private Long id;
}
