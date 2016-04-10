package org.misha.domain.client.impl;

import org.misha.domain.Nation;
import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;

import static java.text.MessageFormat.format;
import static org.misha.domain.Nation.JEWISH;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:54 AM
 */
public class Jewish implements Client {
    private final Specification order;

    public Jewish(final Specification spec) {
        order = spec;
        System.out.println(format("I''m  {0}. {1}", JEWISH, order));
    }

    @Override
    public Nation nation() {
        return JEWISH;
    }

    @Override
    public Specification order() {
        return order;
    }
}
