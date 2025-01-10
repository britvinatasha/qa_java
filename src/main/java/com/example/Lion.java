package com.example;

import java.util.List;

public class Lion {

    private final FelineInterface felineInterface;
    boolean hasMane;
    private Feline feline;
    public Lion(FelineInterface felineInterface, String sex) throws Exception {
        this.felineInterface = felineInterface;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }


    public int getKittens() {
        return felineInterface.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineInterface.eatMeat();
    }
}
