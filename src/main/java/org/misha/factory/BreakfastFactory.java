package org.misha.factory;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.breakfast.Specification;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:32 AM
 */
public interface BreakfastFactory {

    Breakfast getBreakfast(Specification order);
}
