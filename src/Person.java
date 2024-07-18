public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;

//passo in input un builder al costruttore
    public Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String address;

// Voglio che nome e cognome siano obbligati (xciò li passo al costruttore)
        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

//creo setters degli attributi opzionali age e address
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

//metodo x generare gli oggetti Person
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
