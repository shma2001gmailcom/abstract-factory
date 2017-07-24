package org.misha.factory.impl;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.client.Client;
import org.misha.factory.BreakfastFactory;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:36 AM
 */
public class JewishBreakfastFactory implements BreakfastFactory {

    @Override
    public Breakfast getBreakfast(final Client c) {
        return new Breakfast(c);
    }
}
