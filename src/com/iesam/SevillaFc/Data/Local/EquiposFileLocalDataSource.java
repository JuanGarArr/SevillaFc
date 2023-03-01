package com.iesam.SevillaFc.Data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.SevillaFc.Domain.Models.Equipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EquiposFileLocalDataSource {

    private static EquiposFileLocalDataSource instance = null;

    private String nameFile = "Equipos.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Equipos>>() {
    }.getType();

    private EquiposFileLocalDataSource() {
    }

    public void save(Equipos model) {
        List<Equipos> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Equipos> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Equipos> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Equipos findById(Integer id) {
        List<Equipos> models = findAll();
        for (Equipos model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Equipos> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()){
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(Integer modelId) {
        List<Equipos> newList = new ArrayList<>();
        List<Equipos> models = findAll();
        for (Equipos model : models) {
            if (model.getId() != modelId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }

    public static EquiposFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new EquiposFileLocalDataSource();
        }
        return instance;
    }
}
