/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6.reto1.veliz.alvarez.pruebasUnitarias;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DrackMegam
 * @author Laura Álvarez
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @Before
    public void setUp() {
        Producto VacioProducto = new Producto();
        Producto LlenoProducto = new Producto(1234, "Cafe chulo", "Un café chulísimo", Categoria.CAFES, 6, 4, 4.05, TipoIVA.VEINTIUNO);
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetCodBarras() {
    }

    @Test
    public void testSetCodBarras() {
    }

    @Test
    public void testGetNombre() {
        
    }

    @Test
    public void testSetNombre() {
    }

    @Test
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
