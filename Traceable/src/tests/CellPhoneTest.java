package tests;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CellPhoneTest {

    private Person owner;
    private Call call;
    private CellPhone cell;

    @Before
    public void setUp(){

     owner = new Person("john", 35, "vancouver");
     call = new Call(cell, "vancouver");
     cell = new CellPhone(owner, "vancouver");
    }
    @Test
    public void testGetters(){
        assertEquals(cell.getCalls(), call);
        assertEquals(cell.getOwner(), owner);
        assertEquals(cell.getLocation(),"vancouver");
        assertEquals(cell.getTrace(), cell);
    }
    @Test
    public void testAddCall(){
        Call newCall = new Call(cell ,"seoul");
        assertEquals(cell.getCalls().size(), 0);
        cell.addCall(newCall);
        assertEquals(cell.getCalls().size(), 1);
        assertTrue(cell.getCalls().contains(newCall));
        }
        @Test
     public void testTrack(){
      call.Track();
     }


}
