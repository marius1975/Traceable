package model;

public class Fingerprint implements Traceable {

    private Person owner;
    private String precinct;

    public Fingerprint(Person owner , String precinct){
        this.owner = owner;
        this.precinct = precinct;
        owner.setFingerprint(this);
        }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String getLocation() {
        return precinct;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void Track() {
        System.out.println("This fingerprint is located at the following precinct :" + precinct);
    }
}
