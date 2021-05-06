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
public class CafeCapsulas extends Producto{
    
    private int numCapsulas;
    private boolean duplo;
    private MaquinaCapsulas maquina;

    public CafeCapsulas() {
    }

    public CafeCapsulas(int numCapsulas, boolean duplo, MaquinaCapsulas maquina, long codBarras, String nombre, String descripcion, Categoria categoria, int numPasillo, int numEstanteria, double precio, TipoIVA tipoIVA) {
        super(codBarras, nombre, descripcion, categoria, numPasillo, numEstanteria, precio, tipoIVA);
        this.numCapsulas = numCapsulas;
        this.duplo = duplo;
        this.maquina = maquina;
    }

    public int getNumCapsulas() {
        return numCapsulas;
    }

    public void setNumCapsulas(int numCapsulas) {
        this.numCapsulas = numCapsulas;
    }

    public boolean isDuplo() {
        return duplo;
    }

    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }

    public MaquinaCapsulas getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaCapsulas maquina) {
        this.maquina = maquina;
    }
    
    
    
}
