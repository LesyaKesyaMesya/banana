package exception;

import people.Person;

public class PersonIsNotOnYacht extends RuntimeException{
    public PersonIsNotOnYacht(Person person){
        super(String.format("%s не на яхте.", person));
    }
}