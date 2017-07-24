package org.misha.domain;

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

    private Breakfast getBreakfast(final Client c) {
        return breakfastFactory.getBreakfast(c);
    }

    public static Breakfast breakfast(final Client client) {
        return new Kitchen(client.breakfastFactory()).getBreakfast(client);
    }
}
