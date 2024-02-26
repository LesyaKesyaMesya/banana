package yacht;

import exception.ClonesAreNotPossible;
import exception.PersonIsNotOnYacht;
import people.Person;

public abstract class PlaceOnYacht {
    private final Yacht yacht;
    private final Person[] people;
    public PlaceOnYacht(Yacht yacht){
        this.yacht = yacht;
        people = new Person[yacht.getCapacity()];
    }
    public Yacht getYacht(){
        return yacht;
    }
    public void addPerson(Person person){
        for(int i = 0; i<people.length; i++){
            if(yacht.isNotOnYacht(person)) throw new PersonIsNotOnYacht(person);
            if (person.equals(people[i])) throw new ClonesAreNotPossible( person, this);
            else if(people[i] == null) {
                people[i] = person;
                System.out.printf("%s на %s.%n", person, this);
                break;
            }
        }
    }
    public void deletePerson(Person person){
        for(int i = 0; i<people.length; i++){
            if (person.equals(people[i])) {
                people[i]=null;
                System.out.printf("%s ушел с %s.%n", person, this);
                break;
            }
        }
    }
    public boolean isNotOnPlace(Person person){
        for(int i = 0; i<people.length; i++){
            if (person.equals(people[i])) {
                return false;
            }
        }
        return true;
    }
}
