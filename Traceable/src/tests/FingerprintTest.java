package tests;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FingerprintTest {
    private Person person;
    private Fingerprint fp;

    @Before
    public void setUp(){

        person = new Person("john", 35 , "vancouver");
        fp = new Fingerprint(person, "vancouver ");
        }

        @Test
     public void testGetters(){
        assertEquals(fp.getOwner(), "john");
        assertEquals(fp.getLocation(),"vancouver");
        assertEquals(fp.getTrace(), "vancouver");
     }
     @Test
     public void testTrack(){
        fp.Track();
     }
}
