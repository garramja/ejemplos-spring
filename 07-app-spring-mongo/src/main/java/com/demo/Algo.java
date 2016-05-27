package com.demo;

import org.springframework.data.annotation.Id;

/**
 * Created by javier.garcia on 27/05/2016.
 */
public class Algo {

    @Id
    private String id;
    private String nombre;
    private String apaellidos;

    public Algo(String id, String nombre, String apaellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apaellidos = apaellidos;
    }

    @Override
    public String toString() {
        return "Algo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apaellidos='" + apaellidos + '\'' +
                '}';
    }

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets new nombre.
     *
     * @param nombre New value of nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets apaellidos.
     *
     * @return Value of apaellidos.
     */
    public String getApaellidos() {
        return apaellidos;
    }

    /**
     * Gets nombre.
     *
     * @return Value of nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets new apaellidos.
     *
     * @param apaellidos New value of apaellidos.
     */
    public void setApaellidos(String apaellidos) {
        this.apaellidos = apaellidos;
    }
}
