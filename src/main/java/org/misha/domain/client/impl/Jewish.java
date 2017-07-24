package org.misha.domain.client.impl;

import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;

import static org.misha.domain.Nation.JEWISH;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:54 AM
 */
public class Jewish extends Client {

    public Jewish(final Specification spec) {
        super(JEWISH, spec);
    }
}
