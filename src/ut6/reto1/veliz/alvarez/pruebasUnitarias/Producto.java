/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6.reto1.veliz.alvarez.pruebasUnitarias;

/**
 *
 * @author DrackMegam
 * @author Laura Álvarez
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
        this.codBarras=0;
        this.nombre=null;
        this.descripcion="";
        this.categoria=Categoria.DESCONOCIDO;
        this.numPasillo=0;
        this.numEstanteria=0;
        this.precio=0.01;
        this.tipoIVA=TipoIVA.NORMAL;
    }

    public Producto(long codBarras, String nombre, String descripcion, Categoria categoria, int numPasillo, int numEstanteria, double precio, TipoIVA tipoIVA) {
        if (codBarras < 0) {
            this.codBarras = 0;
        } else {
            this.codBarras = codBarras;
        }
        if (nombre == null || nombre.length() == 0) {
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        } else {
            this.nombre = nombre;
        }
        if (descripcion == null) {
            this.descripcion = "";
        } else {
            this.descripcion = descripcion;
        }
        if (categoria == null || categoria!=Categoria.CACAOS_SOLUBLES
                && categoria!=Categoria.CAFÉS
                && categoria!=Categoria.CONGELADOS
                && categoria!=Categoria.DESCONOCIDO
                && categoria!=Categoria.FRESCOS
                && categoria!=Categoria.PANADERIA) {
            this.categoria = Categoria.DESCONOCIDO;
        } else {
            this.categoria = categoria;
        }

        if (numPasillo < 0) {
            this.numPasillo = 0;
        } else {
            this.numPasillo = numPasillo;
        }
        if (numEstanteria < 0) {
            this.numEstanteria = 0;
        } else {
            this.numEstanteria = numEstanteria;
        }
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
        if (!tipoIVA.equals(TipoIVA.SUPERREDUCIDO)
                || !tipoIVA.equals(TipoIVA.REDUCIDO)
                || !tipoIVA.equals(TipoIVA.NORMAL)) {
            this.tipoIVA = TipoIVA.NORMAL;
        } else if (this instanceof CafeCapsulas) {
            this.tipoIVA = TipoIVA.NORMAL;
        } else {
            this.tipoIVA = tipoIVA;
        }

    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        if (codBarras < 0) {
            this.codBarras = 0;
        } else {
            this.codBarras = codBarras;
        }
    }

    public String getNombre() {
        if(this.nombre==null){
            throw new IllegalArgumentException("Nombre nulo");
        }else{
            return nombre;
        }
        
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() == 0) {
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        } else {
            this.nombre = nombre;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null) {
            this.descripcion = "";
        } else {
            this.descripcion = descripcion;
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null || categoria!=Categoria.CACAOS_SOLUBLES
                && categoria!=Categoria.CAFÉS
                && categoria!=Categoria.CONGELADOS
                && categoria!=Categoria.DESCONOCIDO
                && categoria!=Categoria.FRESCOS
                && categoria!=Categoria.PANADERIA) {
            this.categoria = Categoria.DESCONOCIDO;
        } else {
            this.categoria = categoria;
        }
    }

    public int getNumPasillo() {
        return numPasillo;
    }

    public void setNumPasillo(int numPasillo) {
        if (numPasillo < 0) {
            this.numPasillo = 0;
        } else {
            this.numPasillo = numPasillo;
        }
    }

    public int getNumEstanteria() {
        return numEstanteria;
    }

    public void setNumEstanteria(int numEstanteria) {
        if (numEstanteria < 0) {
            this.numEstanteria = 0;
        } else {
            this.numEstanteria = numPasillo;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = numPasillo;
        }
    }

    public TipoIVA getTipoIVA() {
        return tipoIVA;
    }

    public void setTipoIVA(TipoIVA tipoIVA) {
        if (!tipoIVA.equals(TipoIVA.SUPERREDUCIDO)
                || !tipoIVA.equals(TipoIVA.REDUCIDO)
                || !tipoIVA.equals(TipoIVA.NORMAL)) {
            this.tipoIVA = TipoIVA.NORMAL;
        } else if (this instanceof CafeCapsulas) {
            this.tipoIVA = TipoIVA.NORMAL;
        } else {
            this.tipoIVA = tipoIVA;
        }
    }

}
