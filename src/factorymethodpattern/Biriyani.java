package factorymethodpattern;

import java.util.ArrayList;

public abstract class Biriyani {
    String name;
    String oil;
    ArrayList<String> ingredients = new ArrayList<String>();


    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding oil " + oil);
        System.out.println("ingredients added : ");
        for (String ingredient : ingredients)
            System.out.println(" " + ingredient);
    }

    void box(){
        System.out.println("Place into the official box");
    }


    void deliver() {
        System.out.println("Ready for Delivery");
    }
}
