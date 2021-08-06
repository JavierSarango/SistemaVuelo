/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Javier
 */
public class Pasajero extends Persona {
    private int NroAsiento;
    private String ciudadOrigen;
    private String ciudadDestino;
    private Date fechaVuelo;
    private String clase;
    private ArrayList<Pasajero> listapasajeros;
    
    public Pasajero(){
    
    }
    
    /**
     * @return the NroAsiento
     */
    public int getNroAsiento() {
        return NroAsiento;
    }

    /**
     * @param NroAsiento the NroAsiento to set
     */
    public void setNroAsiento(int NroAsiento) {
        this.NroAsiento = NroAsiento;
    }

    /**
     * @return the listapasajeros
     */
    public ArrayList<Pasajero> getListapasajeros() {
        return listapasajeros;
    }

    /**
     * @param listapasajeros the listapasajeros to set
     */
    public void setListapasajeros(ArrayList<Pasajero> listapasajeros) {
        this.listapasajeros = listapasajeros;
    }

    /**
     * @return the ciudadOrigen
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * @param ciudadOrigen the ciudadOrigen to set
     */
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * @return the ciudadDestino
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * @param ciudadDestino the ciudadDestino to set
     */
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    /**
     * @return the fechaVuelo
     */
    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    /**
     * @param fechaVuelo the fechaVuelo to set
     */
    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }
    
}
