package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void checkFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException("Imię jest nieprawidłowe " + firstName);
        }
        if (firstName.length() < 2) {
            throw new NameUndefinedException("Imię ma mniej niż 2 znaki");
        }
    }

    private void checkLastName(String lastName) {
        if (lastName == null) {
            throw new NameUndefinedException("Nazwisko jest nieprawidłowe " + lastName);
        }
        if (lastName.length() < 2) {
            throw new NameUndefinedException("Nazwisko ma mniej niż 2 znaki");
        }
    }

    private void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Podano nieprawidłowy wiek " + age);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", wiek " + age + " lat, pesel: " + pesel;
    }
}
