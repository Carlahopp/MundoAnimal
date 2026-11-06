package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Nina", 3);
        Animal gato = new Gato("Ricalde", 2);
        Animal vaca = new Vaca("Lola", 5);

        Animal[] animales = {perro, gato, vaca};

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
