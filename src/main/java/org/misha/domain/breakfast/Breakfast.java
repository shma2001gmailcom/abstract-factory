package org.misha.domain.breakfast;

import org.misha.domain.Nation;

import java.text.MessageFormat;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:29 AM
 */
public abstract class Breakfast {
    private final Specification specification;
    private Nation nation;

    protected Breakfast(final Specification spec, final Nation n) {
        specification = spec;
        nation = n;
    }

    public void menu() {
        System.out.println(MessageFormat.format("{0}\n{1}", specification.getFirst(), specification.getSecond()));
        System.out.println(MessageFormat.format("{0} breakfast, please.\n", nation));
    }
}
