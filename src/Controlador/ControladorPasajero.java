/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pasajero;
import Modelo.Persona;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Javier
 */
public class ControladorPasajero {
    ArrayList<Pasajero> ListaDPasajeros = new ArrayList<>();
    public void GuadarInformacionTabla(Pasajero pasajero){
        ListaDPasajeros.add(pasajero);
    }
    public DefaultTableModel listadeVuelos(){
        Vector DatosPrincipales = new Vector();
        DatosPrincipales.addElement("Nombres");
        DatosPrincipales.addElement("Apellidos");
        DatosPrincipales.addElement("Cedula");
        DatosPrincipales.addElement("Origen");
        DatosPrincipales.addElement("Destino");
        DatosPrincipales.addElement("Fecha");
        DatosPrincipales.addElement("Asiento");
        DatosPrincipales.addElement("Telefono");
        DatosPrincipales.addElement("Clase");
        DefaultTableModel table = new DefaultTableModel(DatosPrincipales, 0);
        try {
            FileReader fr = new FileReader("infoPasajero.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!= null){
                StringTokenizer dato = new StringTokenizer(linea,"|");
                Vector columnas = new Vector();
                while(dato.hasMoreTokens()){
                    columnas.addElement(dato.nextToken());
                }
                table.addRow(columnas);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return table;
    }
    public boolean GuardarDatos(Pasajero pasajero) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("infoPasajero.txt", true));
            PrintWriter pw = new PrintWriter(bw);
            pw.print(pasajero.getNombres());
            pw.print("|"+pasajero.getApellidos());
            pw.print("|"+pasajero.getCedula());
            pw.print("|"+pasajero.getCiudadOrigen());
            pw.print("|"+pasajero.getCiudadDestino());
            pw.print("|"+pasajero.getFechaVuelo());
            pw.print("|"+pasajero.getNroAsiento());
            pw.print("|"+pasajero.getTelefono());
            pw.println("|"+pasajero.getClase());
            //bw.write(pasajero.getNombres()+" "+ pasajero.getApellidos() + " "+pasajero.getCedula() + " "+pasajero.getCiudadDestino() + pasajero.getCiudadOrigen() + " "+pasajero.getFechaVuelo() + " "+ pasajero.getNroAsiento() + " "+ pasajero.getTelefono() + " "+ pasajero.getClase()+"\n");

            pw.close();
            return true;

        } catch (IOException ex) {
            Logger.getLogger(ControladorPasajero.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}


