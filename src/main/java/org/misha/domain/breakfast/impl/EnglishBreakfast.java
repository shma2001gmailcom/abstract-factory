package org.misha.domain.breakfast.impl;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.breakfast.Specification;

import static org.misha.domain.Nation.ENGLISH;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:34 AM
 */
public class EnglishBreakfast extends Breakfast {

    public EnglishBreakfast(final Specification spec) {
        super(spec, ENGLISH);
    }
}
