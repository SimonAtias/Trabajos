package com.example.demo;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class ManejadorDeArchivosCSV {

    private String ubicacionArchivo;
    private String nombreDeArchivo;
    private char separador;

    public ManejadorDeArchivosCSV() {
        this.ubicacionArchivo = "src/main/resources/files/";
        this.nombreDeArchivo = "incendios-cantidad-causas-parques-nacionales.csv";
        this.separador = ';';
    }

    public CSVParser formatearSeparador(){
        CSVParserBuilder puntoYcomaBuilder = new CSVParserBuilder();
        puntoYcomaBuilder = puntoYcomaBuilder.withSeparator(separador);
        CSVParser parser = puntoYcomaBuilder.build();
        return parser;
    }

    public FileReader obtenerArchivo(){
        FileReader reader = null;
        try {
            reader = new FileReader(ubicacionArchivo + nombreDeArchivo);
        } catch (FileNotFoundException e) {
            String mensaje = "Archivo no encontrado, verifique el nombre y/o la ubicaión del mismo";
            System.out.println(mensaje);
            e.printStackTrace();
        }
        return reader;
    }

    public CSVReader obtenerArchivoFormateado(){
        FileReader fileReader = this.obtenerArchivo();
        CSVReaderBuilder readerBuilder = new CSVReaderBuilder(fileReader);
        CSVParser separadorFormateado = this.formatearSeparador();
        readerBuilder = readerBuilder.withCSVParser(separadorFormateado);
        CSVReader reader = readerBuilder.build();
        return reader;
    }

    public Iterator<String[]> obtenerIterador(){
        CSVReader reader = this.obtenerArchivoFormateado();
        Iterator<String[]> iterador = reader.iterator();
        return iterador;
    }

    public void imprimirDatosConEspacios() throws FileNotFoundException {

        CSVReader reader = this.obtenerArchivoFormateado();
        Iterator<String[]> iterador = reader.iterator();

        while (iterador.hasNext()){
            String[] fila = iterador.next();
            String filaInfo = fila[0] + " " + fila[1] + " " + fila[2] + " " + fila[3] + " " + fila[5];
            System.out.println(filaInfo);

        }

    }

    public HashMap<String,Object> obtenerHashMapConInfo(){

        CSVReader reader = this.obtenerArchivoFormateado();
        Iterator<String[]> iterador = reader.iterator();
        HashMap<String,Object> informacion = new HashMap<>();
        ArrayList<Incendio> incendios = new ArrayList<>();

        while (iterador.hasNext()){
            String[] fila = iterador.next();

            int incendiosAnio = Integer.parseInt(fila[0]);
            int cantIncendios = Integer.parseInt(fila[1]);
            int incendiosNegligentes = Integer.parseInt(fila[2]);
            int incendiosInternacionales = Integer.parseInt(fila[3]);
            int incendiosNatuarles = Integer.parseInt(fila[4]);
            int incendiosCausaDesconocida = Integer.parseInt(fila[5]);

            Incendio incendio = new Incendio(incendiosAnio, cantIncendios, incendiosNegligentes, incendiosInternacionales, incendiosNatuarles, incendiosCausaDesconocida);
            incendios.add(incendio);
        }

        informacion.put("incendios", incendios);

        return informacion;

    }

    public static void main(String[] args) {
        ManejadorDeArchivosCSV m = new ManejadorDeArchivosCSV();
    }

}
