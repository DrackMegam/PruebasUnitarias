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
        this.numCapsulas=8;
        this.duplo=false;
        this.maquina=MaquinaCapsulas.DESCONOCIDO;
    }

    public CafeCapsulas(int numCapsulas, boolean duplo, MaquinaCapsulas maquina, long codBarras, String nombre, String descripcion, Categoria categoria, int numPasillo, int numEstanteria, double precio, TipoIVA tipoIVA) {
        super(codBarras, nombre, descripcion, categoria, numPasillo, numEstanteria, precio, tipoIVA);
        
        if(numCapsulas>=8 && numCapsulas<=32){
             this.numCapsulas = numCapsulas;
        }else{
            this.numCapsulas=8;
        }
        this.duplo = duplo;
        if(maquina==null){
            this.maquina=MaquinaCapsulas.DESCONOCIDO;
        }else{
            this.maquina = maquina;
        }
        
    }

    public int getNumCapsulas() {
        return numCapsulas;
    }

    public void setNumCapsulas(int numCapsulas) {
        if(numCapsulas>=8 && numCapsulas<=32){
             this.numCapsulas = numCapsulas;
        }else{
            this.numCapsulas=8;
        }
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
        if(maquina==null){
            this.maquina=MaquinaCapsulas.DESCONOCIDO;
        }else{
            this.maquina = maquina;
        }
    }
    
    
    
}
