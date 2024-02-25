/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Representa una vivienda con detalles como precio, número de habitaciones, superficie,
 * disponibilidad de parking, estado y propietario.
 */
public class Vivienda {
    // Atributos de la clase
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
   
    /**
     * Constructor para inicializar una vivienda solo con su precio.
     * 
     * @param precio El precio inicial de la vivienda.
     */
    public Vivienda(double precio) {
        this.precio = precio;
    }
    
    /**
     * Constructor para inicializar una vivienda con todos sus detalles.
     * 
     * @param precio El precio de la vivienda.
     * @param numHabitaciones Número de habitaciones de la vivienda.
     * @param superficie Superficie de la vivienda en metros cuadrados.
     * @param parking Indica si la vivienda tiene parking (true) o no (false).
     * @param estado El estado actual de la vivienda (nuevo, usado, etc.).
     * @param propietario El nombre del propietario actual de la vivienda.
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * Establece el precio de la vivienda.
     * 
     * @param precio El nuevo precio de la vivienda.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el precio de la vivienda.
     * 
     * @return El precio de la vivienda.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el número de habitaciones de la vivienda.
     * 
     * @param numHabitaciones El nuevo número de habitaciones.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Devuelve el número de habitaciones de la vivienda.
     * 
     * @return El número de habitaciones.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Establece la superficie de la vivienda.
     * 
     * @param superficie La nueva superficie de la vivienda en metros cuadrados.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Devuelve la superficie de la vivienda.
     * 
     * @return La superficie de la vivienda en metros cuadrados.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Establece la disponibilidad de parking de la vivienda.
     * 
     * @param parking true si la vivienda tiene parking, false en caso contrario.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Indica si la vivienda tiene parking.
     * 
     * @return true si la vivienda tiene parking, false en caso contrario.
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Establece el estado de la vivienda.
     * 
     * @param estado El nuevo estado de la vivienda.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el estado de la vivienda.
     * 
     * @return El estado de la vivienda.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el propietario de la vivienda.
     * 
     * @param propietario El nuevo propietario de la vivienda.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Devuelve el nombre del propietario de la vivienda.
     * 
     * @return El nombre del propietario.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Actualiza el precio de la vivienda aplicando un descuento.
     * 
     * @param descuento El porcentaje de descuento a aplicar sobre el precio actual.
     */
    public void actualizarPrecio(double descuento) {
        double porcentajeDescuento = descuento / 100.0;
        double cantidadDescontada; 
 }
}
