package com.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by javier.garcia on 27/05/2016.
 */
public interface AlgoRepository extends MongoRepository<Algo, String> {

    Algo getByNombre(String nombre);

    List<Algo> getListaByNombre(String nombre);

}
