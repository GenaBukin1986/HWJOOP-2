package org.example;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if ((plate.getFood() - this.appetite) < 0 && !this.satiety){
            System.out.printf("Котик %s никогда еще не был так рассержен как сейчас!\n", this.name);
            System.out.printf("Срочно добавь еды в тарелку, чтобы\nпокормить %s и уладить конфликт!\n\n", this.name);

        } else if(this.satiety) {
            System.out.printf("Котик %s сыт!\nНа данный момент он не хочет кушать.\nПопробуйте покормить его позднее.\n",this.name);

        }else{
                plate.setFood(plate.getFood() - this.getAppetite());
                System.out.printf("Котик %s говорит Вам: \"Thank you!\",\nза то, что Вы его покормили.\n\n", this.name);
                this.setSatiety(true);
            }

    }

    public void infoCat(){
        System.out.printf("Котик - %s\n",this.name);
        if (this.satiety) System.out.println("На данный момент котик сыт и не желает кушать!\n\n");
        else {
            System.out.printf("Котик %s давно ничего не ел.\nЧтобы покормить его, нужно %d еды!\n",this.name,this.appetite);
            System.out.println("Перед тем, как кормить котика,\nпосмотрите не пуста ли его тарелка!\n\n");
        }
    }

    public void infoSatiety(){
        if (this.satiety) System.out.printf("Котик %s сыт!\n", this.name);
        else System.out.printf("Котик %s до сих пор голоден!\n", this.name);
    }
}

