
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared){
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }
        // convert the object into a Person object
        Person comparedPerson = (Person) compared;
        SimpleDate comparedDate=(SimpleDate) comparedPerson.getBirthday();
        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedPerson.name) &&
                this.birthday.equals(comparedDate)&&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height) {
            return true;
        }
            

        // otherwise the objects are not equal
        return false;
    }

    // implement an equals method here for checking the equality of objects

    public String getName() {
        return name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
