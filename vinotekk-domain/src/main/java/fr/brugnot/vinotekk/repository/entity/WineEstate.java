package fr.brugnot.vinotekk.repository.entity;


import lombok.Data;

@Data
public class WineEstate extends MongoEntity{

    private String name;

    private String description;
}
