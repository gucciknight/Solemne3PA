/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Cristian
 */
public class Busqueda {

    public static void main(String[] args) throws MalformedURLException,
            IOException {
        
        URL url = new URL ("http://www.omdbapi.com/?i=tt3896198&apikey=274a298b");
        InputStream entrada = url.openStream();
        JsonReader reader = Json.createReader(entrada);
        JsonObject objeto = reader.readObject();
        
        double puntaje = Double.parseDouble(objeto.getJsonObject("Ratings").get("imdbRating").toString());
        System.out.println("El Puntaje de la pelicula es " + puntaje);
    }
}
