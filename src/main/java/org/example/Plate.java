package org.example;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        if (food < 0) {
            this.food = 10;
        } else this.food = food;
    }
    public void info() {
        System.out.println("\nplate: " + food + "\n");
    }

    public void addFood(Human human){
        if (human.isMooney() && human.getAnyfood() != 0){
            setFood(getFood() + human.getAnyfood());
            human.setMooney(false);
            human.setAnyfood(0);
            System.out.printf("%s наполнил тарелку\n\n",human.getName());
        } else {
            System.out.printf("%s не может пополнить тарелку так,\nкак у него нет корма!\n\n",human.getName());
        }

    }
}
