package org.example;

public class Human {
    private String name;

    private int anyfood;

    private boolean mooney;

    public void setAnyfood(int anyfood) {
        this.anyfood = anyfood;
    }

    public String getName() {
        return name;
    }

    public boolean isMooney() {
        return mooney;
    }

    public void setMooney(boolean mooney) {
        this.mooney = mooney;
    }

    public Human(String name, int anyfood) {
        this.name = name;
        this.anyfood = anyfood;
        this.mooney = true;
    }

    public int getAnyfood() {
        return anyfood;
    }

    public void infoHuman() {
        if (anyfood != 0) {
            System.out.printf("Привет, меня зовут %s!\nУ меня есть %d еды для котиков!\n\n", this.name, this.anyfood);
        } else {
            System.out.printf("Это опять %s!\nК сожалению сейчас у меня пока нет еды для котиков!\n\n",this.name);
        }
    }
}
