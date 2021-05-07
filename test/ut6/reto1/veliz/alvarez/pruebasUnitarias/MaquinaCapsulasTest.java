/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6.reto1.veliz.alvarez.pruebasUnitarias;

import java.util.Arrays;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DrackMegam
 */
public class MaquinaCapsulasTest {
    
    public MaquinaCapsulasTest() {
    }
    

    @Test
    public void testValues() {
        Assert.assertEquals("[Nespresso, Dolce Gusto, Tassimo, Lavazza, Senseo, Desconocido]", Arrays.toString(MaquinaCapsulas.values()));
        Assert.assertNotEquals("[Panadería, Solubles, Cafés, Frescos, Cacaos Solubles, Cafés]", Arrays.toString(MaquinaCapsulas.values()));
        Assert.assertNotEquals("achus", Arrays.toString(MaquinaCapsulas.values()));
    }

    @Test
    public void testValueOf() {
        Assert.assertNotEquals("Nespresso", MaquinaCapsulas.valueOf("NESPRESSO"));
        Assert.assertNotEquals("Desconocido", MaquinaCapsulas.valueOf("DOLCE_GUSTO"));
        Assert.assertNotEquals("Senseo", MaquinaCapsulas.valueOf("DESCONOCIDO"));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Lavazza", MaquinaCapsulas.LAVAZZA.toString());
        Assert.assertEquals("Tassimo", MaquinaCapsulas.TASSIMO.toString());
        Assert.assertNotEquals("Desconocido", MaquinaCapsulas.SENSEO.toString());
    }

    @Test
    public void testParseValue() {
        Assert.assertEquals(MaquinaCapsulas.DESCONOCIDO, MaquinaCapsulas.parseValue(null));
        Assert.assertEquals(MaquinaCapsulas.NESPRESSO, MaquinaCapsulas.parseValue("Nespresso"));
        Assert.assertNotEquals(MaquinaCapsulas.TASSIMO, MaquinaCapsulas.parseValue("Congelados"));
    }
    
}
