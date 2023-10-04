public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }

    public String toString(){
        return "My name is " + this.lastName + ", " + this.lastName + " " + this.firstName;
    }
}

/*
A STRING REPRESENTATION OF AN OBJECT AND THE toString-METHOD.

poor style is creating a method for printing the object i.e., the printPerson-method
    - A preferred way is to define a method for the object that returns a "string representation" of the object.
    - The method returning the string representation is always 'toString' in Java. (works same way as printPerson).

 */