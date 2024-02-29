package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Banker {
    private List<Double> OfferEV;

    public Banker() {
        this.OfferEV = new ArrayList<>(List.of(33.0, 35.0, 36.0, 39.0, 42.0, 53.0, 58.0, 67.0, 90.0));
    }


    public int bankOffer(Map<Integer, Double> availableSuitcases, int index){
        int offer;
        double amountMoney = 0;
        for (Integer i : availableSuitcases.keySet()) {
            amountMoney = amountMoney +availableSuitcases.get(i);
        }
        offer = (int) Math.floor(amountMoney*(OfferEV.get(index)/100));
        System.out.println("Bank ruft an und bietet: " + offer);
        System.out.println("Nimmst du das Angebot an - Deal or No Deal?");
        return offer;
    }



}
