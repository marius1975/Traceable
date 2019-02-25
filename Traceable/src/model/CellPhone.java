package model;

import java.util.ArrayList;
import java.util.List;

public class CellPhone implements Traceable {

    private List<Call> calls;
    private Person owner;
    private String location;


    public CellPhone(Person owner , String location){
        calls = new ArrayList<>();
        this.owner = owner;
        this.location = location;

    }

    public Person getOwner() {
        return owner;
    }

    public List<Call> getCalls() {
        return calls;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public Object getTrace() {
        return this;
    }
    public void addCall(Call c){
        calls.add(c);
    }

    @Override
    public void Track() {
        System.out.println("This cellphone is located at :" + location);
    }
}
