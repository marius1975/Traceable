package tests;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;
    private Fingerprint fp;

    @Before
    public void setUp(){

        person = new Person("john" , 35 , "vancouver");
        fp = new Fingerprint(person, "vancouver");
    }
    @Test
    public void testGetters(){
        assertEquals(person.getName(),"john");
        assertEquals(person.getAge(), 35);
        assertEquals(person.getLocation(),"vancouver");
        assertEquals(person.getFingerprint(), fp);
        assertEquals(person.getTrace(), person);
    }
    @Test
    public void testTrack(){
        person.Track();
    }
}
