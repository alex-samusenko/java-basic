package ru.java.lesson6;

public class Musician {
    private final String name;

    public Musician(String name) {
        this.name = name;
    }

    public String description() {
        //String s = "value = " + 2 + 2;
        return name + " plays anything.";
    }

    protected String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Кит Ричардс играет на гитаре: " + new GuitarPlayer("Кит Ричардс").description());
    }
}

class GuitarPlayer extends Musician {
    public GuitarPlayer(String name) {
        super(name);
    }

    @Override
    public String description() {
        return getName() + " plays a guitar.";
    }
}

class KeyboardPlayer extends Musician {
    public KeyboardPlayer(String name) {
        super(name);
    }

    @Override
    public String description() {
        return getName() + " plays a keyboard.";
    }
}
