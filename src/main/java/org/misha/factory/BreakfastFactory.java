package org.misha.factory;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.client.Client;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:32 AM
 */
public interface BreakfastFactory {

    Breakfast getBreakfast(Client c);
}
