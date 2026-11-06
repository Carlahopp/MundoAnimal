package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Max", 3);
        Animal gato = new Gato("Luna", 2);
        Animal vaca = new Vaca("Lola", 5);
        Animal caballo = new Caballo("Secretariat", 4);

        Animal[] animales = {perro, gato, vaca, caballo};

        for (Animal animal : animales) {
            animal.mostrarInformacion();
            animal.hacerSonido();

            if (animal instanceof Movible) {
                Movible movible = (Movible) animal;
                movible.moverse();
            }
        }
    }
}
