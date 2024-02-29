package application;

import java.util.*;

public class Suitcase {

    private Map<Integer, Double> suitcaseListAvailable;
    private Map<Integer, Double> suitcaseListNotAvailableAnymore;
    private List<Double> arrayListMoney;

    public Suitcase() {
        this.suitcaseListAvailable = new HashMap<>();
        this.suitcaseListNotAvailableAnymore = new HashMap<>();
        this.arrayListMoney = new ArrayList<>(Set.of(0.01, 0.20, 0.50, 1.0, 5.0, 10.0, 20.0, 50.0, 100.0, 200.0, 300.0, 400.0, 500.0, 1000.0, 2500.0, 5000.0, 7500.0, 10000.0, 12500.0, 15000.0, 20000.0, 25000.0, 50000.0, 100000.0, 150000.0, 250000.0));
    }


    public void takeASuitcase (int numOfSuitcase){
        suitcaseListNotAvailableAnymore.put(numOfSuitcase, suitcaseListAvailable.get(numOfSuitcase));
        suitcaseListAvailable.remove(numOfSuitcase);
        System.out.println("You choose the suitcase Nr. "+numOfSuitcase+" which includes "+suitcaseListNotAvailableAnymore.get(numOfSuitcase)+" Euro");
        System.out.println(" ");
    }


    public double takeYourFirstSuitcase (int numOfSuitcase){
        suitcaseListNotAvailableAnymore.put(numOfSuitcase, suitcaseListAvailable.get(numOfSuitcase));
        suitcaseListAvailable.remove(numOfSuitcase);
        System.out.println("You choose the suitcase Nr. "+numOfSuitcase);
        System.out.println(" ");
        return suitcaseListNotAvailableAnymore.get(numOfSuitcase);
    }




    public void createSuitcaseList() {
        for (int i = 0; i < arrayListMoney.size(); i++) {
            suitcaseListAvailable.put(i + 1, arrayListMoney.get(i));
        }
    }

    public void printAvailableSuitcases() {
        System.out.println("Available Suitcases:");
        int counter = 0;
        for (Integer key : suitcaseListAvailable.keySet()) {
            System.out.print("Nr. "+key);
            if (++counter < suitcaseListAvailable.size()){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }


    public void printChosenSuitcases() {
        System.out.println("Chosen Suitcases:");
        int counter = 0;
        for (Integer key : suitcaseListNotAvailableAnymore.keySet()) {
            System.out.print("Nr. "+key+": "+suitcaseListNotAvailableAnymore.get(key)+" Euro");
            if (++counter < suitcaseListNotAvailableAnymore.size()){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }


    public Map<Integer, Double> returnSuitcaseListAvailable(){
        return suitcaseListAvailable;
    }

}

