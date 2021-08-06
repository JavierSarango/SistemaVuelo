/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pasajero;
import Modelo.Persona;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


/**
 *
 * @author Javier
 */
public class ControladorPasajero {

//    public void crearArchivo(ArrayList<Pasajero> lista){
//    FileWriter flwriter = null;
//        try {
//            flwriter = new FileWriter("infopas.txt");
//            BufferedWriter bw = new BufferedWriter(flwriter);
//            for (Pasajero pasajero : lista) {
//                
//            }
//           
//        } catch (Exception e) {
//        }
//    
//    
//    
//    }
    public boolean GuardarDatos(Pasajero pasajero) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("infoPasajero.txt", true));
            bw.write(pasajero.getNombres()+" "+ pasajero.getApellidos() + " "+pasajero.getCedula() + " "+pasajero.getCiudadDestino() + pasajero.getCiudadOrigen() + " "+pasajero.getFechaVuelo() + " "+ pasajero.getNroAsiento() + " "+ pasajero.getTelefono() + " "+ pasajero.getClase()+"\n");

            bw.close();
            return true;

        } catch (IOException ex) {
            Logger.getLogger(ControladorPasajero.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
//
//    public void MostrarDatos() {
//        try {
//            File archivo = null;
//            FileReader fr = null;
//            BufferedReader br = null;
//            
//            archivo = new File("infoPasajero.txt"); 
//            fr = new FileReader (archivo);
//            br = new BufferedReader(fr);       
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ControladorPasajero.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }


    }


