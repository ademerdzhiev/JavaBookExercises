package Listings;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Listing_14_6 {
    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);

        IntegerProperty age = new SimpleIntegerProperty(30);

        d1.bind(d2.multiply(2));
        d2.bindBidirectional(d1);

        System.out.println("d1 is: " + d1.getValue());
        System.out.println("d2 is: " + d2.getValue());

        d2.setValue(34.12);

        System.out.println("d1 is: " + d1.getValue());
        System.out.println("d2 is: " + d2.getValue());
    }
}
