package org.misha.domain.client;

import org.misha.domain.Nation;
import org.misha.domain.breakfast.Specification;
import org.misha.factory.BreakfastFactory;

import static java.text.MessageFormat.format;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:53 AM
 */
public abstract class Client {
    private final Nation nation;
    private final Specification spec;

    protected Client(final Nation nation, final Specification order) {
        this.nation = nation;
        this.spec = order;
        System.out.println(format("-- I''m {0}. {1}", nation, order.toString()));
    }

    public BreakfastFactory breakfastFactory() {
        return nation.breakFastFactory();
    }

    public Specification getSpecification() {
        return spec;
    }

    public Nation getNation() {
        return nation;
    }
}
