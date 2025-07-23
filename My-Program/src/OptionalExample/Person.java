package OptionalExample;

import java.util.List;

public class Person {
    private String name;
    private String email;
    private List<String> hobby;

    public Person(String name, String email, List<String> hobby) {
        this.name = name;
        this.email = email;
        this.hobby = hobby;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hobby=" + hobby +
                '}';
    }
}
