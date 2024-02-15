import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        intro();
        int chosenCave = chooseCave();
        exploreCave(chosenCave);
    }

    public static void intro() {
        System.out.println("Welcome to the Text-Based Adventure Game!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You find yourself standing in front of a mysterious cave.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your mission is to explore the cave and find the treasure hidden inside.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int chooseCave() {
        Scanner scanner = new Scanner(System.in);
        int cave = 0;
        while (cave != 1 && cave != 2) {
            System.out.println("Which cave will you enter? (1 or 2)");
            cave = scanner.nextInt();
        }
        return cave;
    }

    public static void exploreCave(int chosenCave) {
        System.out.println("You approach the cave...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("It's dark and spooky...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You enter the cave and see two paths ahead...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You carefully proceed down path " + chosenCave + "...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Suddenly, a giant dragon appears in front of you and...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int friendlyCave = (chosenCave == 1) ? 2 : 1;
        System.out.println("It looks like this cave is empty.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You continue exploring and find a chest full of treasures!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Congratulations! You have found the treasure!");
    }
}