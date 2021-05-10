
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
 * @author Laura Álvarez
 */
public class ProductoTest {

    // Creación de objetos a testear.
    Producto vacioProducto;
    Producto llenoProducto;

    public ProductoTest() {
    }

    @Before
    public void setUp() throws Exception {
        // Inicialización de objetos a testear.
        vacioProducto = new Producto();
        llenoProducto = new Producto(1234, "Cafe chulo", "Un café chulísimo", Categoria.CAFÉS, 6, 4, 4.05, TipoIVA.NORMAL);
    }

    @After
    public void tearDown() {
        // Anulación de objetos tras las pruebas.
        vacioProducto=null;
        llenoProducto=null;
    }

    @Test
    public void testGetCodBarras() {
        Assert.assertEquals(1234, llenoProducto.getCodBarras());
        // Código de barras igual a 0 por defecto.
        Assert.assertEquals(0, vacioProducto.getCodBarras());
        Assert.assertNotEquals(987, llenoProducto.getCodBarras());
    }

    @Test
    public void testSetCodBarras() {
        vacioProducto.setCodBarras(3);
        Assert.assertEquals(3, vacioProducto.getCodBarras());
        // Números negativos no permitidos. Settea a 0.
        vacioProducto.setCodBarras(-3);
        Assert.assertEquals(0, vacioProducto.getCodBarras());
    }

    @Test
    public void testGetNombre() {
        Assert.assertEquals("Cafe chulo", llenoProducto.getNombre());
    }
    
    @Test
    (expected = IllegalArgumentException.class)
    public void testGetNombreNulo() {
        // No se permiten objetos nulos, por lo que tampoco que los devuelva.
        vacioProducto.getNombre();
        fail("El nombre no era nulo.");
    }

    @Test
    public void testSetNombre() {
        vacioProducto.setNombre("Agustin");
        Assert.assertEquals("Agustin", vacioProducto.getNombre());
    }
    
    @Test
    (expected = IllegalArgumentException.class)
    public void testSetNombreNulo() {
        // No permite nombres nulos o vacíos.
        llenoProducto.setNombre(null);
        llenoProducto.setNombre("");
        fail("Se ha permitido un nombre nulo");
    }

    @Test
    // (timeout = 1000)
    public void testGetDescripcion() {
        // Al inicializar con null, se cambia a una cadena vacía.
        Assert.assertEquals("", vacioProducto.getDescripcion());
    }

    @Test
    public void testSetDescripcion() {
        // Al introducir una cadena nula, la cambia por una vacía.
        llenoProducto.setDescripcion(null);
        Assert.assertEquals("", llenoProducto.getDescripcion());
    }

    @Test
    public void testGetCategoria() {
        Assert.assertEquals(Categoria.CAFÉS, llenoProducto.getCategoria());
        // Al estar vacío, devuelve categoría desconocida.
        Assert.assertEquals(Categoria.DESCONOCIDO, vacioProducto.getCategoria());
        
    }

    @Test
    public void testSetCategoria() {
        llenoProducto.setCategoria(Categoria.DESCONOCIDO);
        Assert.assertEquals(Categoria.DESCONOCIDO, llenoProducto.getCategoria());
        vacioProducto.setCategoria(Categoria.PANADERIA);
        Assert.assertEquals(Categoria.PANADERIA, vacioProducto.getCategoria());
    }

    @Test
    public void testGetNumPasillo() {
        Assert.assertEquals(6,llenoProducto.getNumPasillo());
        //No puede ser negativo.Guarda 0 en este caso.
        Assert.assertNotEquals(-2,vacioProducto.getNumPasillo());
        Assert.assertEquals(0,vacioProducto.getNumPasillo());
        Assert.assertNotEquals(70,llenoProducto.getNumPasillo());
    }

    @Test
    public void testSetNumPasillo() {
        vacioProducto.setNumPasillo(12);
        Assert.assertEquals(12, vacioProducto.getNumPasillo());
        //Numeros negativos no permitidos. Settea 0.
        vacioProducto.setNumPasillo(-2);
        Assert.assertEquals(0, vacioProducto.getNumPasillo());
    }

    @Test
    public void testGetNumEstanteria() {
         Assert.assertEquals(4,llenoProducto.getNumEstanteria());
        //No puede ser negativo.Guarda 0 en este caso.
        Assert.assertNotEquals(-4,vacioProducto.getNumEstanteria());
        Assert.assertEquals(0,vacioProducto.getNumEstanteria());
        Assert.assertNotEquals(50,llenoProducto.getNumEstanteria());
    }

    @Test
    public void testSetNumEstanteria() {
         vacioProducto.setNumEstanteria(1);
        Assert.assertEquals(1, vacioProducto.getNumEstanteria());
        //Numeros negativos no permitidos. Settea 0.
        vacioProducto.setNumEstanteria(-8);
        Assert.assertEquals(0, vacioProducto.getNumEstanteria());
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
