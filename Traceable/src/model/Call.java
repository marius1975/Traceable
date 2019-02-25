package model;

public class Call implements Traceable {

    private CellPhone outgoingCaller;
    private String location;

    public Call(CellPhone outgoingCaller , String location){
        this.outgoingCaller = outgoingCaller;
        this.location = location;


    }

    public CellPhone getOutgoingCaller() {
        return outgoingCaller;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void Track() {
        System.out.println("This call is originating from this location :" + location);
    }
}



