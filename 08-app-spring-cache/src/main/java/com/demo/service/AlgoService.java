package com.demo.service;

import com.demo.model.Algo;

/**
 * Created by javier.garcia on 27/05/2016.
 */
public interface AlgoService {

    Algo getAlgoCacheDelay(String id);
    Algo getAlgoCacheNoDelay(String id);
    Algo getAlgoNoCacheDelay(String id);
    Algo getAlgoNoCacheNoDelay(String id);

}
