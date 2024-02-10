package net.javacoureses.spb.payload;

public class User {
    private int id;
    private String firstName;
    private String LastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ", firstName:" + firstName +
                ", LastName:"  + LastName;
    }
}
