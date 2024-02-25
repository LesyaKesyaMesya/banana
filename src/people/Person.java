package people;

import enums.PhysicalState;
import java.util.Objects;

public abstract class Person {
    private final String name;
    private PhysicalState physicalState;
    private String mentalState;
    public Person(String name){
        this.name = name;
        physicalState = PhysicalState.ALIVE;
        mentalState = "спокойный";
    }
    public void setMentalState(String mentalState){
        this.mentalState = mentalState;
    }
    public void setPhysicalState(PhysicalState physicalState){
        this.physicalState = physicalState;
    }
    public String getMentalState(){
        return mentalState;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, physicalState, mentalState);
    }
    @Override
    public boolean equals(Object object){
        if(object==this) return true;
        if(object==null||object.getClass()!=getClass()) return false;
        Person person = (Person) object;
        return name.equals(person.name) && physicalState.equals(person.physicalState) && mentalState.equals(person.mentalState);
    }
    @Override
    public String toString(){
        return name;
    }
}
