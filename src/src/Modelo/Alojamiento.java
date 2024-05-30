package Modelo;

import enumeraciones.EstadoAlojamiento;

import java.util.Date;

public abstract class Alojamiento{

    //atributos
    private double precioXAlojar;
    private double valoracion; //0 a 5
    private int cantReservas;
    private String descripcion;
    private final String nombre;
    private final String direccion;
    private final String zona;
    private String comentarios;

    private EstadoAlojamiento estado;

    //constructores


    public Alojamiento(double precioXAlojar, String descripcion, String nombre, String direccion, String zona, String comentarios,  EstadoAlojamiento estado, int cantReservas) {
        this.precioXAlojar = precioXAlojar;
        //valoracion se saca porcentaje entre las que se pongan despues de una reserva
        valoracion = 0;
        this.cantReservas = cantReservas;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.zona = zona;
        this.comentarios = comentarios;

        this.estado = estado;
    }

    public Alojamiento() {
        precioXAlojar = 0;
        valoracion = 0;
        cantReservas=0;
        descripcion = "";
        nombre="";
        direccion="";
        zona="";
        comentarios="";
        estado = EstadoAlojamiento.DISPONIBLE;

    }

//getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public double getPrecioXAlojar() {
        return precioXAlojar;
    }

    public double getValoracion() {
        return valoracion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public String getZona() {
        return zona;
    }

    public boolean isDisponibilidad() {
        return this.estado == EstadoAlojamiento.DISPONIBLE;
    }

    public int getCantReservas() {
        return cantReservas;
    }

    public EstadoAlojamiento getEstado() {
        return estado;
    }

    public void setEstado(EstadoAlojamiento estado) {
        this.estado = estado;
    }
    //setters


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public void setPrecioXAlojar(double precioXAlojar) {
        this.precioXAlojar = precioXAlojar;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }


    //metodos


    @Override
    public String toString() {
        return "Alojamiento{" +
                "precioXAlojar=" + precioXAlojar +
                ", valoracion=" + valoracion +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", zona='" + zona + '\'' +
                ", comentarios='" + comentarios + '\'' +

                ", estado=" + estado +


                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta=false;
        if(obj!=null){
            if(obj instanceof Alojamiento alojamiento){
                if(alojamiento.getNombre().equalsIgnoreCase(nombre)&& alojamiento.precioXAlojar==precioXAlojar && alojamiento.getValoracion()==valoracion && alojamiento.direccion.equalsIgnoreCase(direccion)){
                    rta=true;
                }
            }
        }


        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void aumentarCantReservas(){
        cantReservas++;
    }

    public void calculoValoracion(double nuevaValoracion){
        valoracion= (valoracion + nuevaValoracion) / cantReservas;
    }

}

