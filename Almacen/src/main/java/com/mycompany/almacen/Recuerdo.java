/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author maria
 */
public class Recuerdo {
    File archivo ;
    
    public Recuerdo() {
        archivo = new File("C:\\Users\\maria\\OneDrive\\Documentos\\GitHub\\patronesSoftware\\Almacen\\recuerdo.txt");
    }
    
    public void setRecuerdo(String recuerdo) throws IOException{
        Writer escritor = new BufferedWriter(new FileWriter(archivo, true)) ;
        escritor.append(recuerdo+"\n");
        escritor.close();
    }
}
