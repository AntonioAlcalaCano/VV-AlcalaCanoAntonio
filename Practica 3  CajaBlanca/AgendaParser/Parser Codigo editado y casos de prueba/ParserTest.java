import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

    @Test
    public void Test1 ()
    {

        // comprobamos en el caso que el entry no tiene ningun dato
        Parser p = new Parser();
        Entry en = new Entry();
        p.insertEntry(en);
        Assert.assertEquals("No ha entrado", p.contadorPrueba);

    }

    @Test
    public void Test2 ()
    {
        //comprobamos en el caso de que le hemos insertado datos al Entry
        Parser p = new Parser();
        Entry en = new Entry();
        en.setName("a");
        en.setSurname("b");
        en.setAddress("c");
        en.setCity("d");
        en.setCounty("e");
        en.setZip("f");
        en.setTelephone("g");
        en.setBirthYear(12);
        p.insertEntry(en);
        Assert.assertEquals("Ha entrado", p.contadorPrueba);
    }
}
