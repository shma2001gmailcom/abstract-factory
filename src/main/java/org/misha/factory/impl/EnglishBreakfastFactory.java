package org.misha.factory.impl;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.breakfast.Specification;
import org.misha.domain.breakfast.impl.EnglishBreakfast;
import org.misha.factory.BreakfastFactory;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:37 AM
 */
public class EnglishBreakfastFactory implements BreakfastFactory {

    @Override
    public Breakfast getBreakfast(Specification order) {
        return new EnglishBreakfast(order);
    }
}
