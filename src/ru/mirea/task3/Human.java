package ru.mirea.task3;

public class Human {
    private Head head;
    private Hand[] hands;
    private Leg[] legs;

    Human() {
        head = new Head();
        hands = new Hand[] { new Hand(), new Hand() };
        legs = new Leg[] { new Leg(), new Leg() };
    }

    public void startMentalActivity(String mentalActivity) {
        head.setMentalActivity(mentalActivity);
    }

    public void stopMentalActivity() {
        head.stopMentalActivity();
    }

    public void pickUpItem(String item) {
        if (!hands[0].isEmpty() && !hands[1].isEmpty())
            return;

        Hand freeHand = hands[0];
        if (!freeHand.isEmpty())
            freeHand = hands[1];

        freeHand.pickUpItem(item);
    }

    public String getItemsInHands() {
        return "Left hand: " + hands[0].getItem() + "\n" +
                    "Right hand: " + hands[1].getItem();
    }

    public void throwItems() {
        hands[0].throwItem();
        hands[1].throwItem();
    }

    public void run() {
        legs[0].run();
        legs[1].run();
    }

    public void stopRun() {
        legs[0].stopRun();
        legs[1].stopRun();
    }

    @Override
    public String toString() {
        return head.toString() + '\n' + legs[0].toString() + '\n' + legs[1].toString() + '\n' +
                hands[0].toString() + '\n' + hands[1].toString();
    }
}
