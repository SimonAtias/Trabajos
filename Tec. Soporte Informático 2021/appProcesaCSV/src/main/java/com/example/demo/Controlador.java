package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controlador {


    @Autowired
    private ManejadorDeArchivosCSV archivoCSV;

    @Autowired
    private Servicio servicioParaSubirArchivos;

    public Controlador() {
        this.archivoCSV = new ManejadorDeArchivosCSV();
        this.servicioParaSubirArchivos = new Servicio();
    }

    @GetMapping("/")
    public String index() {
        return "inicio";
    }

    @RequestMapping(value = "/datos/csv", method = RequestMethod.GET)
    public ResponseEntity<Object> enviarDatosCSV() {
        HashMap<String, Object> valores = archivoCSV.obtenerHashMapConInfo();
        return new ResponseEntity<>(valores, HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/json", method = RequestMethod.GET)
    public ResponseEntity<Object> enviarDatosJson(){
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String,Object> datos = new HashMap<>();
        ArrayList jsonDeserializado = new ArrayList();
        try {
            jsonDeserializado = mapper.readValue(new File("src/main/resources/files/producto_2018.json"), ArrayList.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        datos.put("producto",jsonDeserializado);
        return new ResponseEntity<>(datos,HttpStatus.OK);
    }

}

