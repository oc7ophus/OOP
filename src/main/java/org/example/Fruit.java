package org.example;

import jdk.jfr.Label;

public class Fruit {

    private String _fruitVariety;
    private String _tradeMarkName;
    private int _price;
    private int _quantity;

    public String toString() {
        return getFruitVariety() + " " + getTradeMarkName();
    }

    public boolean equals(Fruit fruitToCompare) {
        return getFruitVariety() == fruitToCompare.getFruitVariety() &&
                getTradeMarkName() == fruitToCompare.getTradeMarkName();
    }

    public Fruit(String fruitVariety, String tradeMarkName) {
        // A constructor is a method BUT there is NO return type
        // Also, it must match the class name exactly

        setFruitVariety(fruitVariety);
        setTradeMarkName(tradeMarkName);

        // It is frowned upon to directly access the private variables, i.e.:
        // _fruitVariety = fruitVariety;
        // Use your setters and getters!
    }

    // When setting default values, it is a good idea to declare them alongside your variables
    // i.e.:
    // private String _fruitVariety = "NO_VALUE";
    // However, you can also add back the empty/default constructor and set the values there

    public Fruit() {
        setFruitVariety("NO VARIETY");
        setTradeMarkName("NO TRADEMARK");
    }

    // Setters

    void setFruitVariety(String fruitVariety) {
        _fruitVariety = fruitVariety;
    }

    void setTradeMarkName(String tradeMarkName) {
        _tradeMarkName = tradeMarkName;
    }

    // Getters

    String getFruitVariety() {
        return _fruitVariety;
    }

    String getTradeMarkName() {
        return _tradeMarkName;
    }
}
