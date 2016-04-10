package org.misha.domain.kitchen;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;
import org.misha.factory.BreakfastFactory;

/**
 * author: misha
 * date: 4/10/16
 * time: 2:02 AM
 */
public class Kitchen {
    private final BreakfastFactory breakfastFactory;

    private Kitchen(final BreakfastFactory bf) {
          breakfastFactory = bf;
    }

    private Breakfast getBreakfast(Specification order) {
        return breakfastFactory.getBreakfast(order);
    }

    public static Breakfast breakfast(final Client client) {
        return new Kitchen(client.nation().breakFastFactory()).getBreakfast(client.order());
    }
}
