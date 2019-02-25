package model;

public class Person implements Traceable {

    private String name;
    private int age;
    private String location;
    private Fingerprint fingerprint;

    public Person(String name , int age , String location){
        this.name = name;
        this.age = age;
        this.location = location;
        fingerprint = null;
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public Fingerprint getFingerprint() {
        return fingerprint;
    }
    public Object getTrace(){
        return this;
    }

    public void setFingerprint(Fingerprint fingerprint) {
        this.fingerprint = fingerprint;
    }
    public void Track(){
        System.out.println("This person is located at the following precinct:" + location);
    }
}
