package org.misha.domain;

import org.misha.factory.BreakfastFactory;
import org.misha.factory.impl.EnglishBreakfastFactory;
import org.misha.factory.impl.JewishBreakfastFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:55 AM
 */
public enum Nation {

    ENGLISH,
    JEWISH;

    private static final Map<Nation, BreakfastFactory> factories = new HashMap<Nation, BreakfastFactory>();

    static {
        factories.put(ENGLISH, new EnglishBreakfastFactory());
        factories.put(JEWISH, new JewishBreakfastFactory());
    }

    public BreakfastFactory breakFastFactory() {
        return factories.get(this);
    }

    @Override
    public String toString() {
        switch(this) {
            case ENGLISH : return "English";
            case JEWISH : return "Jewish";
            default: return "Cosmopolitan";
        }
    }
}
