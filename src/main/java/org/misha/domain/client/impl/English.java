package org.misha.domain.client.impl;

import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;

import static org.misha.domain.Nation.ENGLISH;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:53 AM
 */
public class English extends Client {

    public English(final Specification spec) {
        super(ENGLISH, spec);
    }
}
