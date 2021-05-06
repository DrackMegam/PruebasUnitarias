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
public enum MaquinaCapsulas {
    NESPRESSO("Nespresso"),
    DOLCE_GUSTO("Dolce Gusto"),
    TASSIMO("Tassimo"),
    LAVAZZA("Lavazza"),
    SENSEO("Senseo"),
    DESCONOCIDO("Desconocido");

    private String nombreMaquina;

    MaquinaCapsulas(String machine) {
        this.nombreMaquina = machine;
    }

    @Override
    public String toString() {
        return this.nombreMaquina;
    }

    public static final MaquinaCapsulas parseValue(String valor) {
        try {
            valor = valor.trim();
            for (MaquinaCapsulas mc : MaquinaCapsulas.values()) {
                if (mc.nombreMaquina.equalsIgnoreCase(valor)) {
                    return mc;
                }
            }
            return MaquinaCapsulas.DESCONOCIDO;
        } catch (Exception ex) {
            return MaquinaCapsulas.DESCONOCIDO;
        }
    }
}
