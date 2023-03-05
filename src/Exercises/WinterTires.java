package Exercises;

public class WinterTires {
    public static void main(String[] args) {
        // do I need winter tires?
        // if temp < 10C && road slippery --> yes
        // if temp < 4C --> yes
        //else --> no

        int temp = 4;
        boolean slipperyRoad = false;

        needWinterTires(temp, slipperyRoad);

        needWinterTires(3, false);
        needWinterTires(12, false);
        needWinterTires(12, true);
        needWinterTires(9,true );
    }

    public static boolean needWinterTires (int temp, boolean slipperyRoad) {
        boolean winterTires = true;
        if (temp < 4) {
            System.out.println("I need Winter tires");
        } else if (temp < 10 && slipperyRoad) {
            System.out.println("I need Winter tires");
        } else {
            System.out.println("I don't need Winter tires");
        } return winterTires;
    }
}
