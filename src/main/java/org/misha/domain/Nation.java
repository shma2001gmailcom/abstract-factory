package org.misha.domain;

import org.misha.factory.BreakfastFactory;
import org.misha.factory.impl.BreakfastFactoryImpl;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:55 AM
 */
public enum Nation {
    ENGLISH("English"),

    JEWISH("Jewish");

    private final String name;
    private final BreakfastFactory breakFastFactory;

    Nation(final String nation) {
        this.breakFastFactory = new BreakfastFactoryImpl();
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
