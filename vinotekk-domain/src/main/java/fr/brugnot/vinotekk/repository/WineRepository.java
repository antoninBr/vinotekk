package fr.brugnot.vinotekk.repository;

import fr.brugnot.vinotekk.repository.entity.Wine;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.Year;

public interface WineRepository extends MongoRepository<Wine, String> {

    Wine findByYear(Year year);
}
