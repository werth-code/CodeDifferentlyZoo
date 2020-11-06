package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Eagle;
import com.codedifferently.circus.animals.Hampster;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class); //Better version of System.out.println();

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){
        this.animals = new ArrayList<>(); //all of our animals will do the same thing. SO ALL EAGLES WILL BACKFLIP
    }

    public void startTheShow(){
        logger.info("Let's get this party started!");
        Bear bearRemote = new Bear("Tubbs");
        animals.add(bearRemote);
        Hampster hampster = new Hampster("Limpy");
        animals.add(hampster);
        Eagle eagle = new Eagle("Tony");
        animals.add(eagle);

        Eagle eagle1 = new Eagle("Tonia");
        animals.add(eagle1);

        for(int i = 0; i < animals.size(); i++) {

            AbstractAnimal temp = animals.get(i);
            temp.doTrick();
        }
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
