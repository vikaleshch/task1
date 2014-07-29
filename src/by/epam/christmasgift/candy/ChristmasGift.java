package by.epam.christmasgift.candy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by Vika on 27.07.2014.
 */
public class ChristmasGift implements Iterable<Candy> {
    private ArrayList<Candy> gift;

    public ChristmasGift() {
        gift = new ArrayList<>();
    }

    public void addCandy(Candy candy){
        gift.add(candy);
    }

    public void removeCandy(int index){
        gift.remove(index);
    }

    public Candy getCandy(int index) {
        return gift.get(index);
    }

    @Override
    public Iterator<Candy> iterator() {
        return gift.iterator();
    }

    public void sort(Comparator<Candy> comparator){
        Collections.sort(this.gift,comparator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChristmasGift candies = (ChristmasGift) o;

        if (!gift.equals(candies.gift)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gift.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChristmasGift{ ");
        stringBuilder.append("gift: ");
        stringBuilder.append(gift);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
