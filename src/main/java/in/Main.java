package in;

import in.salads.HerringUnderFurCoatSalad;
import in.salads.OlivierSalad;
import in.salads.Salad;
import in.salads.VegetableSalad;

public class Main {
    public static void main(String[] args) {

        System.out.println("Приготовление овощного салата:");
        Salad vegetableSalad = new VegetableSalad();
        for (int i = 0; i < 5; i++) {
            vegetableSalad.prepareSalad();
            System.out.println();
        }

        System.out.println("Приготовление салата Оливье:");
        Salad olivierSalad = new OlivierSalad();
        olivierSalad.prepareSalad();
        System.out.println();

        System.out.println("Приготовление салата Селёдка под шубой:");
        Salad herringUnderFurCoatSalad = new HerringUnderFurCoatSalad();
        herringUnderFurCoatSalad.prepareSalad();
        System.out.println();

    }
}