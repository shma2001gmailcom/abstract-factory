package org.misha.domain;

import org.misha.factory.BreakfastFactory;
import org.misha.factory.impl.EnglishBreakfastFactory;
import org.misha.factory.impl.JewishBreakfastFactory;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:55 AM
 */
public enum Nation {
    ENGLISH(new EnglishBreakfastFactory(), "English"),

    JEWISH(new JewishBreakfastFactory(), "Jewish");

    private final String name;
    private final BreakfastFactory breakFastFactory;

    Nation(final BreakfastFactory breakfastFactory, final String nation) {
        this.breakFastFactory = breakfastFactory;
        this.name = nation;
    }

    public BreakfastFactory breakFastFactory() {
        return breakFastFactory;
    }

    @Override
    public String toString() {
        return name;
    }
}
