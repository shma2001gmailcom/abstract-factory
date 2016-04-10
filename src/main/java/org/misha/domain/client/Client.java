package org.misha.domain.client;

import org.misha.domain.Nation;
import org.misha.domain.breakfast.Specification;

/**
 * author: misha
 * date: 4/10/16
 * time: 12:53 AM
 */
public interface Client {

    public Nation nation();

    public Specification order();


}
