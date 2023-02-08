/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jbferraz
 */
public class Carro {
    
    private String placa;
    private String marca;
    private String modelo;
    private int anoFab;
    private int anoMod;
    private Pessoa proprietario;

    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, int anoFab, int anoMod, Pessoa proprietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getAnoMod() {
        return anoMod;
    }

    public void setAnoMod(int anoMod) {
        this.anoMod = anoMod;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoFab=" + anoFab + ", anoMod=" + anoMod + ", \n\tproprietario=" + proprietario + '}';
    }
    
    
}
