package by.epam.christmasgift.main;

import by.epam.christmasgift.candy.Candy;
import by.epam.christmasgift.candy.Chocolate;
import by.epam.christmasgift.candy.ChristmasGift;
import by.epam.christmasgift.candy.Lollipop;
import by.epam.christmasgift.logic.GiftProcessor;

import java.util.Comparator;

/**
 * Created by Vika on 27.07.2014.
 */
public class Main {
    public static void main(String[] args){
        ChristmasGift gift = new ChristmasGift();
        gift.addCandy(new Chocolate(7, 20, 30, 10, 30, 11,
                Chocolate.ChocolateType.MILK, Chocolate.StuffingType.JELLY));
        gift.addCandy(new Lollipop(10, 30, 40, 20, 75, 45, "Cherry"));
        gift.addCandy(new Lollipop(12, 20, 25, 50, 12, 45, "Strawberry"));
        System.out.println(gift);
        GiftProcessor processor = new GiftProcessor();
        System.out.println(processor.getWeight(gift));
        Comparator<Candy> comparator = new Comparator<Candy>() {
            @Override
            public int compare(Candy o1, Candy o2) {
                return Integer.compare(o1.getFat(), o2.getFat());
            }
        };
        gift.sort(comparator);
        System.out.println(gift);
        System.out.println(processor.getCandyWithSugarContent(gift, 10, 40));
    }
}
