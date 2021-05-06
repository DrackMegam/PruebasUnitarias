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
public enum TipoIVA {
    SUPERREDUCIDO("superreducido", 4),
    REDUCIDO("reducido", 10),
    NORMAL("normal", 21);

    private final String nombreIVA;
    private final int valorIVA;

    TipoIVA(String nombre, int valor) {
        this.nombreIVA = nombre;
        this.valorIVA = valor;
    }

    @Override
    public String toString() {
        return this.nombreIVA + " - " + this.valorIVA + "%";
    }

    /**
     * Devuelve el nombre común de este IVA, como cadena
     *
     * @return nombre común de este IVA, como cadena
     */
    public String getNombreIVA() {
        return nombreIVA;
    }

    /**
     * Valor del IVA, numérico
     *
     * @return valor del IVA, numérico
     */
    public int getValorIVA() {
        return valorIVA;
    }

}

