package org.misha.domain.kitchen;

import org.misha.domain.breakfast.Breakfast;
import org.misha.domain.client.Client;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:33 AM
 */
public class KitchenMap {

    public static Breakfast getBreakfast(final Client client) {
        return client.nation().breakFastFactory().getBreakfast(client.order());
    }
}

