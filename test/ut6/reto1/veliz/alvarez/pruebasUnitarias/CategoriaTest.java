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
public class CategoriaTest {

    public CategoriaTest() {
    }

    @Test
    public void testValues() {
        Assert.assertEquals("[Panadería, Congelados, Cafés, Frescos, Cacaos Solubles, Desconocido]", Arrays.toString(Categoria.values()));
        Assert.assertNotEquals("[Panadería, Solubles, Cafés, Frescos, Cacaos Solubles, Cafés]", Arrays.toString(Categoria.values()));
        Assert.assertNotEquals("achus", Arrays.toString(Categoria.values()));

    }

    @Test
    public void testValueOf() {
        Assert.assertNotEquals("Congelados", Categoria.valueOf("FRESCOS"));
        Assert.assertNotEquals("Desconocido", Categoria.valueOf("CONGELADOS"));
        Assert.assertNotEquals("Congelados", Categoria.valueOf("DESCONOCIDO"));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Cacaos Solubles", Categoria.CACAOS_SOLUBLES.toString());
        Assert.assertEquals("Desconocido", Categoria.DESCONOCIDO.toString());
        Assert.assertNotEquals("Desconocido", Categoria.CONGELADOS.toString());
    }
    

    @Test
    public void testParseValue() {
        Assert.assertEquals(Categoria.DESCONOCIDO, Categoria.parseValue("asdasd"));
        Assert.assertEquals(Categoria.CONGELADOS, Categoria.parseValue("Congelados"));
        Assert.assertNotEquals(Categoria.CAFÉS, Categoria.parseValue("Congelados"));
    }

}
