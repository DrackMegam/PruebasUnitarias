
package ut6.reto1.veliz.alvarez.pruebasUnitarias;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DrackMegam
 * @author Laura Álvarez
 */
public class CafeCapsulasTest {
    
    CafeCapsulas vacioCafe;
    CafeCapsulas llenoCafe;
    
    public CafeCapsulasTest() {
    }
    
    @Before
    public void setUp() {
        vacioCafe = new CafeCapsulas();
        llenoCafe = new CafeCapsulas(9,false,MaquinaCapsulas.NESPRESSO,1234,"Cafe nuevo","Cafess",Categoria.CAFÉS,8,9,5.4,TipoIVA.NORMAL);
    }
    
    @After
    public void tearDown() {
        vacioCafe=null;
        llenoCafe=null;
    }

    @Test
    public void testGetNumCapsulas() {
        Assert.assertEquals(9,llenoCafe.getNumCapsulas());
        Assert.assertNotEquals(0,vacioCafe.getNumCapsulas());
        Assert.assertNotEquals(70,llenoCafe.getNumCapsulas());
    }

    @Test
    public void testSetNumCapsulas() {
        vacioCafe.setNumCapsulas(10);
        Assert.assertEquals(10, vacioCafe.getNumCapsulas());
        //Numeros menores a 8 no permitidos. Settea a 8.
        vacioCafe.setNumCapsulas(-7);
        Assert.assertEquals(8,vacioCafe.getNumCapsulas());
    }

    @Test
    public void testIsDuplo() {
        Assert.assertFalse(llenoCafe.isDuplo());
        Assert.assertTrue(!vacioCafe.isDuplo());
    }

    @Test
    public void testSetDuplo() {
        vacioCafe.setDuplo(true);
        Assert.assertTrue(vacioCafe.isDuplo());
    }

    @Test
    public void testGetMaquina() {
        Assert.assertEquals(MaquinaCapsulas.NESPRESSO,llenoCafe.getMaquina());
        //Al estar vació,devuelve Capsula Desconocida.
        Assert.assertEquals(MaquinaCapsulas.DESCONOCIDO,vacioCafe.getMaquina());
    }

    @Test
    public void testSetMaquina() {
        llenoCafe.setMaquina(MaquinaCapsulas.TASSIMO);
        Assert.assertEquals(MaquinaCapsulas.TASSIMO,llenoCafe.getMaquina());
        vacioCafe.setMaquina(MaquinaCapsulas.DOLCE_GUSTO);
        Assert.assertEquals(MaquinaCapsulas.DOLCE_GUSTO,vacioCafe.getMaquina());
    }
    
}
