/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6.reto1.veliz.alvarez.pruebasUnitarias;

/**
 *
 * @author DrackMegam
 */
public class Producto {
    
    private long codBarras;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private int numPasillo;
    private int numEstanteria;
    private double precio;
    private TipoIVA tipoIVA; 

    public Producto() {
    }

    public Producto(long codBarras, String nombre, String descripcion, Categoria categoria, int numPasillo, int numEstanteria, double precio, TipoIVA tipoIVA) {
        if(codBarras<0){
            this.codBarras=0;
        }else{
            this.codBarras = codBarras;
        }
        if(nombre==null || nombre.length()==0){
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        }else{
            this.nombre = nombre;
        }
        if(descripcion==null){
            this.descripcion="";
        }else{
            this.descripcion = descripcion;
        }
        this.categoria = categoria;
        this.numPasillo = numPasillo;
        this.numEstanteria = numEstanteria;
        this.precio = precio;
        this.tipoIVA = tipoIVA;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        if(codBarras<0){
            this.codBarras=0;
        }else{
            this.codBarras = codBarras;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre==null || nombre.length()==0){
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        }else{
            this.nombre = nombre;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion==null){
            this.descripcion="";
        }else{
            this.descripcion = descripcion;
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumPasillo() {
        return numPasillo;
    }

    public void setNumPasillo(int numPasillo) {
        this.numPasillo = numPasillo;
    }

    public int getNumEstanteria() {
        return numEstanteria;
    }

    public void setNumEstanteria(int numEstanteria) {
        this.numEstanteria = numEstanteria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoIVA getTipoIVA() {
        return tipoIVA;
    }

    public void setTipoIVA(TipoIVA tipoIVA) {
        this.tipoIVA = tipoIVA;
    }
    
    
    
    
}
