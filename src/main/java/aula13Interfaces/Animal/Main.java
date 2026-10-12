package aula13Interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

        ArrayList<Animal> animais = new ArrayList<>();
        animais.addAll(List.of(bidu, salem));

        for(Animal animal : animais){
            animal.emitirSom();
        }
    }
}
