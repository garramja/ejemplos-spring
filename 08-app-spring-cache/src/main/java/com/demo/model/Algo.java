package com.demo.model;

/**
 * Created by javier.garcia on 27/05/2016.
 */
public class Algo {

    private String id;
    private String texto;

    @Override
    public String toString() {
        return "Algo{" +
                "id='" + id + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }

    public Algo(String id, String texto) {
        this.id = id;
        this.texto = texto;
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
     * Sets new texto.
     *
     * @param texto New value of texto.
     */
    public void setTexto(String texto) {
        this.texto = texto;
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
     * Gets texto.
     *
     * @return Value of texto.
     */
    public String getTexto() {
        return texto;
    }
}
