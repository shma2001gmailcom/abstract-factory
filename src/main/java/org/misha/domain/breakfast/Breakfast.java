package org.misha.domain.breakfast;

import org.misha.domain.Nation;
import org.misha.domain.client.Client;

import static java.text.MessageFormat.*;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:29 AM
 */
public class Breakfast {
    private final Specification specification;
    private final Nation nation;

    public Breakfast(final Client c) {
        specification = c.getSpecification();
        nation = c.getNation();
    }

    public void menu() {
        System.out.println(format("-- {0} breakfast: ", nation) + specification.toString().replaceAll("Can I ask ", "") + "\n");
    }
}
