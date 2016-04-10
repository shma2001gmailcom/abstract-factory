package org.misha.domain.client.impl;

import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;
import org.misha.domain.Nation;

import java.text.MessageFormat;

import static org.misha.domain.Nation.*;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:53 AM
 */
public class English implements Client {
    private final Specification order;

    public English(final Specification spec) {
        order = spec;
        System.out.println(MessageFormat.format("I''m English. {0}", order.toString()));
    }

    @Override
    public Nation nation() {
        return ENGLISH;
    }

    @Override
    public Specification order() {
        return order;
    }
}