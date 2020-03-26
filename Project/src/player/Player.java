package player;

import java.util.Random;

public class Player {

    private String name;
    private int money;
    private int position;

    public Player(String name) {
        this.name = name;
        setMoney(1000);
    }

    public int rollTheDice() {
        Random random = new Random();
        int i = 1 + random.nextInt(6);
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
