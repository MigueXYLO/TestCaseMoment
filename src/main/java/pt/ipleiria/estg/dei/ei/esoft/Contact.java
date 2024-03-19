package pt.ipleiria.estg.dei.ei.esoft;

import java.util.Date;
import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String phone;
    private String email;


    public Contact(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Contact(String firstName, String phone) {
        this.firstName = firstName;
        this.phone = phone;
    }

    public Contact(String firstName, String lastName, Date birthday, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // TODO Generate constructors
    // TODO Generate getters and setters

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact another)) return false;
        if (this.firstName != another.firstName) return false;
        if (this.lastName != another.lastName) return false;
        if (this.birthday != another.birthday) return false;
        if (this.phone != another.phone) return false;
        return this.email == another.email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthday, phone, email);
    }

}