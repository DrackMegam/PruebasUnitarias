/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6.reto1.veliz.alvarez.pruebasUnitarias;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;

/**
 *
 * @author DrackMegam
 */
public class ProductoTest {

    Producto vacioProducto;
    Producto llenoProducto;

    public ProductoTest() {
    }

    @Before
    public void setUp() throws Exception {
        vacioProducto = new Producto();
        llenoProducto = new Producto(1234, "Cafe chulo", "Un café chulísimo", Categoria.CAFÉS, 6, 4, 4.05, TipoIVA.NORMAL);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetCodBarras() {
        Assert.assertEquals(1234, llenoProducto.getCodBarras());
        Assert.assertNotEquals(987, llenoProducto.getCodBarras());
    }

    @Test
    public void testSetCodBarras() {
        vacioProducto.setCodBarras(3);
        Assert.assertEquals(3, vacioProducto.getCodBarras());
    }

    @Test
    public void testSetCodBarras2() {
        // Ponemos -3, pero lo tiene que settear como 0.
        vacioProducto.setCodBarras(-3);
        Assert.assertEquals(0, vacioProducto.getCodBarras());
    }

    @Test
    public void testGetNombre() {
    }

    @Test
    (expected = IllegalArgumentException.class)
    public void testSetNombre() {
        llenoProducto.setNombre(null);
    }

    @Test
    (timeout = 1000)
    public void testGetDescripcion() {
    }

    @Test
    public void testSetDescripcion() {
    }

    @Test
    public void testGetCategoria() {
    }

    @Test
    public void testSetCategoria() {
    }

    @Test
    public void testGetNumPasillo() {
    }

    @Test
    public void testSetNumPasillo() {
    }

    @Test
    public void testGetNumEstanteria() {
    }

    @Test
    public void testSetNumEstanteria() {
    }

    @Test
    public void testGetPrecio() {
    }

    @Test
    public void testSetPrecio() {
    }

    @Test
    public void testGetTipoIVA() {
    }

    @Test
    public void testSetTipoIVA() {
    }

}
