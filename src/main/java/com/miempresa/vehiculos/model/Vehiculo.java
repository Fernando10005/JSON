package com.miempresa.vehiculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {
    @Id
    private String placa;
    private String modelo;
    private String color;
    private Integer puertas;

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Integer getPuertas() { return puertas; }
    public void setPuertas(Integer puertas) { this.puertas = puertas; }
}
