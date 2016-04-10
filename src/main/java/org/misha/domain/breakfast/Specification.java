package org.misha.domain.breakfast;

import static java.text.MessageFormat.format;

/**
 * author: misha
 * date: 4/10/16
 * time: 2:57 AM
 */
public abstract class Specification {

    public abstract String getFirst();

    public abstract String getSecond();

    @Override
    public String toString() {
        return format("Can I ask {0} and {1}, please.", getFirst(), getSecond());
    }
}
