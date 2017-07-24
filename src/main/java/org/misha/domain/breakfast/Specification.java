package org.misha.domain.breakfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

import static java.text.MessageFormat.format;

/**
 * author: misha
 * date: 4/10/16
 * time: 2:57 AM
 */
public class Specification implements Iterable<String>{
    private final List<String> dishes = new ArrayList<>();

    public Specification addDish(final String d) {
        dishes.add(d);
        return this;
    }

    @Override
    public String toString() {
        return format("Can I ask {0}, please.", StringUtils.join(dishes, " and "));
    }

    @Override
    public Iterator<String> iterator() {
        return dishes.iterator();
    }
}
