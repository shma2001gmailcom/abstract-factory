package org.misha.domain.breakfast.impl;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.breakfast.Specification;

import static org.misha.domain.Nation.JEWISH;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:35 AM
 */
public class JewishBreakfast extends Breakfast {

    public JewishBreakfast(final Specification spec) {
        super(spec, JEWISH);
    }
}
