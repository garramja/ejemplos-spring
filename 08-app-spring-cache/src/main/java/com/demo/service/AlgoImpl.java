package com.demo.service;

import com.demo.model.Algo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

/**
 * Created by javier.garcia on 27/05/2016.
 */
@Component
public class AlgoImpl implements AlgoService {

    @Override
     public Algo getAlgoNoCacheNoDelay(String id) {
        return getAlgo(id);
    }

    @Override
    public Algo getAlgoNoCacheDelay(String id) {
        delay();
        return getAlgo(id);
    }

    @Cacheable("cachedealgos")
    public Algo getAlgoCacheNoDelay(String id) {
        return getAlgo(id);
    }

    @Cacheable("cachedealgos")
    public Algo getAlgoCacheDelay(String id) {
        delay();
        return new Algo(id, "Esto es un algo");
    }

    private Algo getAlgo(String id) {
        return new Algo(id, "Un algo");
    }

    private void delay() {
        //emulamos un delay del servicio
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
