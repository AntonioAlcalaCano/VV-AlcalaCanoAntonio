import org.junit.Assert;
import org.junit.Test;

public class EntryTest {

    @Test
    public void Test1 ()
    {
        //Comprobamos en el caso de que en el entry no tengamos ningun dato
        Entry en = new Entry();
        Assert.assertTrue(!en.hasData());

    }

    @Test
    public void Test2 ()
    {
        //comprobamos en el caso de que les hemo insertado un nombre
        Entry en = new Entry();
        en.setName("a");
        Assert.assertTrue(!en.hasData());
    }

    @Test
    public void Test3 ()
    {
        //comprobamos en el caso de que les hemo insertado un apellido
        Entry en = new Entry();
        en.setSurname("a");
        Assert.assertTrue(!en.hasData());
    }

    @Test
    public void Test4 ()
    {
        //comprobamos en el caso de que les hemo insertado un nombre y apellido
        Entry en = new Entry();
        en.setName("a");
        en.setSurname("a");
        Assert.assertTrue(en.hasData());
    }
}
