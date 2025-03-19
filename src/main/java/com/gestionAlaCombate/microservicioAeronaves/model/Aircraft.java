package com.gestionAlaCombate.microservicioAeronaves.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "aircrafts")
public class Aircraft {
    private String id;
    private String model;
    private String tailNumber;
    private int year;

    public Aircraft() {}

    public Aircraft(String id, String model, String tailNumber, int year) {
        this.id = id;
        this.model = model;
        this.tailNumber = tailNumber;
        this.year = year;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getTailNumber() { return tailNumber; }
    public void setTailNumber(String tailNumber) { this.tailNumber = tailNumber; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
