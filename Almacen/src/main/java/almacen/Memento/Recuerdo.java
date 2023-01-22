/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.Memento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Clase Recuerdo que se encarga de llevar la copia de seguridad de entradas y salidas de productos
 * del almacén.
 * @author maria
 */
public class Recuerdo {
    //Atributo de la clase
    File archivo ;
    
    /**
     * Constructor de la clase Recuerdo
     * Establece el archivo a la ruta en la que lo tenemos en nuestro ordenador
     */ 
    public Recuerdo() {
        archivo = new File("C:\\Users\\maria\\OneDrive\\Documentos\\GitHub\\patronesSoftware\\Almacen\\recuerdo.txt");
    }
    
    /**
     * Método para incluir una nueva línea en el archivo
     * @param recuerdo -> línea a introducir en el archivo
     * @throws java.io.IOException
     */ 
    
    public void setRecuerdo(String recuerdo) throws IOException{
        Writer escritor = new BufferedWriter(new FileWriter(archivo, true)) ;
        escritor.append(recuerdo+"\n");
        escritor.close();
    }
}
