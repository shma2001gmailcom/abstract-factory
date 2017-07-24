package org.misha.domain.breakfast;

import java.util.ArrayList;
import java.util.List;

import static java.text.MessageFormat.format;
import static org.apache.commons.lang3.StringUtils.join;

/**
 * author: misha
 * date: 4/10/16
 * time: 2:57 AM
 */
public class Specification {
    private final List<String> dishes = new ArrayList<>();

    public Specification addDish(final String d) {
        dishes.add(d);
        return this;
    }

    @Override
    public String toString() {
        return format("Can I ask {0}, please.", join(dishes, " and "));
    }
}
