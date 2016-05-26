package com.demo.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by javier.garcia on 26/05/2016.
 */
@Component
public class Fecha {

    private static SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Autowired
    Environment environment;

    /**
     * La expresion cron la obtenemos de un .properties dado que hemos registrado
     * en la clase de configuracion un PropertySource.
     * Otras opciones es indicar un fixed o un delayed.
     */
    @Scheduled(cron = "${job.cron}")
    public void imprimeHora() {

        String mensaje = environment.getProperty("hora.inicio");
        String hora = formater.format(new Date());

        /*
        Poder hacer un env.getProperty es gracias al autowired de Environment
         */
        mensaje += " " + hora;
        if (hora.endsWith("1"))
            mensaje += " " + environment.getProperty("hora.uno");

        if (hora.endsWith("3"))
            mensaje += " " +  environment.getProperty("hora.tres");

        if (hora.endsWith("5"))
            mensaje += " " +  environment.getProperty("hora.cinco");

        System.out.println(mensaje);
    }

}
