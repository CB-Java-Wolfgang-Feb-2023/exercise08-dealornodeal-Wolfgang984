package application;

import java.util.Map;
import java.util.Scanner;

public class Player {

    public Player() {
    }

    public int chooseASuitcase(Map<Integer, Double> suitcaseListAvailable) {
        Scanner sc = new Scanner(System.in);

        String value = null;
        boolean userInputIsNumber = false;
        while (!userInputIsNumber){
            value = sc.nextLine();

            try {
                if (!suitcaseListAvailable.containsKey(Integer.parseInt(value))){
                    System.out.println("Suitcase is not available!");
                } else {
                    userInputIsNumber = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input is not an Integer - Please enter again: ");
            }

        }
        return Integer.parseInt(value);
    }


    public boolean dealOrNoDeal(){
        Scanner sc = new Scanner(System.in);
        String input = null;
        boolean userInputValid = false;
        while (!userInputValid){
            System.out.println("Für einen Deal gib 'y' an und für NoDeal gib 'n' an!");
            input = sc.next();

            if (input.equals("y") || input.equals("n")){
                userInputValid = true;
            } else {
                System.out.println("ungültige Eingabe");
            }
        }

        if (input.equals("y")){
            return true;
        }
        return false;
    }
}
