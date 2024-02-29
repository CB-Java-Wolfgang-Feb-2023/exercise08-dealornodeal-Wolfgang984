package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numOfSuitcasesEachRound = new ArrayList<>(List.of(6,5,4,3,2,1,1,1,1,1,1));
        int count = 0;
        double wonAmountOfMoney = 0.0;
        boolean dealOrNoDeal;
        int dealBank;

        Suitcase suitcase = new Suitcase();
        Banker banker = new Banker();
        Player player = new Player();

        suitcase.createSuitcaseList();

        while (count < 10){
            System.out.println(" ");
            System.out.println("****************************************************");
            suitcase.printAvailableSuitcases();
            suitcase.printChosenSuitcases();
            if (count == 0){
                System.out.println("Wähle deinen ersten Koffer:");
                wonAmountOfMoney = suitcase.takeYourFirstSuitcase(player.chooseASuitcase(suitcase.returnSuitcaseListAvailable()));
            }
            int loop = 0;
            System.out.println(" ");
            System.out.println("****************************************************");
            System.out.println("Round "+(count+1)+" begins:");
            while (loop < numOfSuitcasesEachRound.get(count)){
                System.out.println("Wähle einen Koffer:");
                suitcase.takeASuitcase(player.chooseASuitcase(suitcase.returnSuitcaseListAvailable()));
                loop++;
            }
            count++;

            if (count < 9){
                dealBank = banker.bankOffer(suitcase.returnSuitcaseListAvailable(), count);
                dealOrNoDeal = player.dealOrNoDeal();
                if (dealOrNoDeal){
                    System.out.println("Du hast dich für einen Deal entschieden - die Bank übergibt dir: "+dealBank+" Euro");
                    count = 11;
                }
            }

            if (count == 10){
                System.out.println("You won "+wonAmountOfMoney+" Euro");
            }
        }
    }
}
