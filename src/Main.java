public class Main {
    public static void main(String[] args) {

// Creo persona usando il builder, passo i 2 parametri obbligati e poi setto solo quelli che voglio
        Person person1 = new Person.PersonBuilder("Mario", "Rossi").setAge(30).setAddress("Via Roma 1, Roma").build();

// Creo seconda persona provando a togliere un attributo
        Person person2 = new Person.PersonBuilder("Carlo", "Verdi").setAge(72).build();

// Stampo gli oggetti creati
        System.out.println(person1);
        System.out.println(person2);
    }
}