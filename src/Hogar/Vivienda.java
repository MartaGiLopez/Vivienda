/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Vivienda {
    // Atributos privados
    
   private double precio;
  private  int numHabitaciones;
   private double superficie;
   private boolean parking;
   private String estado;
   private String propietario;
   
   //Constructor
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    //Constructor que recibe todos los parámetros
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    //Setter y Getter para precio
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    //Setter y Getter para numHabitaciones
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    // Setter y Getter para superficie
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    // Setter y Getter para parking
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isParking() {
        return parking;
    }

    // Setter y Getter para estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    // Setter y Getter para propietario
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPropietario() {
        return propietario;
    }
}
// Método actualizarPrecio con descuento
    public void actualizarPrecio(double descuento) {
        double porcentajeDescuento = descuento / 100.0;
        double cantidadDescontada = this.precio * porcentajeDescuento;
        this.precio -= cantidadDescontada;
    }


