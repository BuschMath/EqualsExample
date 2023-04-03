
/*In this example, the Person class overrides the equals() 
    method to test if two Person objects are equal based on 
    their name and age attributes. */

public class Person {
    private String name;
    private int age;

    // constructor and getters/setters omitted for brevity

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }
}
