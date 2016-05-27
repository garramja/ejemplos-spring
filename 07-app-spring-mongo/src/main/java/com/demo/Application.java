package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * Created by javier.garcia on 27/05/2016.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private AlgoRepository algoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {

        //Borramos toda la colección
        algoRepository.deleteAll();

        //Guardamos un para de algos
        algoRepository.save(new Algo("1","Pepe","Bueno"));
        algoRepository.save(new Algo("2","Andres","Suave"));
        algoRepository.save(new Algo("3","Pepe","Malo"));

        //Obtenemos un algo
        System.out.println(algoRepository.getByNombre("Pepe"));

        //Obtenemos todos los registros por nombre
        List<Algo> listaAlgos = algoRepository.getListaByNombre("Pepe");
        for(Algo algo : listaAlgos) {
            System.out.println(algo);
        }
    }
}
