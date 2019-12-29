package p3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgendaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAddEntryCP1() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		
		e1.setName("entrada");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		
		a1.addEntry(e1,true);
		
		assertEquals("70 78 ", a1.getTraza());
	}
	@Test
	public void testAddEntryCP2() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		
		e1.setName("entrada");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		
		a1.addEntry(e1,false);
		
		assertEquals("70 73 ", a1.getTraza());
	}	
	@Test
	public void testAddEntryCP31() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		e1.setName("CP31");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		AgendaNode an1 = new AgendaNode(e1, null);
		
		a1.setFirst(an1);
		a1.addEntry(e1, true);
		
		assertEquals("54 78 ", a1.getTraza());
	}
	@Test
	public void testAddEntryCP32() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		e1.setName("entrada");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		AgendaNode an1 = new AgendaNode(e1, null);
		
		a1.setFirst(an1);
		a1.addEntry(e1,true);
		
		assertEquals("54 78 ", a1.getTraza());
	}
	@Test
	public void testAddEntryCP33() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		e1.setName("CP33");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		AgendaNode an1 = new AgendaNode(e1, null);
		
		a1.setFirst(an1);
		a1.addEntry(e1, false);
		
		assertEquals("54 73 ", a1.getTraza());
	}
	@Test
	public void testAddEntryCP4() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		e1.setName("CP4");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		Entry e2 = new Entry();
		e2.setName("CP6");
		e2.setSurname("uno");
		e2.setAddress("direccion1");
		e2.setCity("ciudad1");
		e2.setCounty("pais1");
		e2.setZip("0000");
		e2.setTelephone("123456789");
		e2.setBirthYear(1234);
		
		AgendaNode an1 = new AgendaNode(e1, null);
		
		a1.setFirst(an1);
		a1.addEntry(e2, false);
		
		assertEquals("54 59 65 73 ", a1.getTraza());
	}
	@Test
	public void testAddEntryCP5() {
		Agenda a1 = new Agenda();
		
		Entry e1 = new Entry();
		e1.setName("entrada");
		e1.setSurname("uno");
		e1.setAddress("direccion1");
		e1.setCity("ciudad1");
		e1.setCounty("pais1");
		e1.setZip("0000");
		e1.setTelephone("123456789");
		e1.setBirthYear(1234);
		
		AgendaNode an1 = new AgendaNode(e1, null);
		
		a1.setFirst(an1);
		a1.addEntry(e1,false);
		
		assertEquals("54 59 61 78 ", a1.getTraza());
	}
}
