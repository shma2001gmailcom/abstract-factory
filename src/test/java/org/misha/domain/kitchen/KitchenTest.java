package org.misha.domain.kitchen;

import org.junit.Test;
import org.misha.domain.Kitchen;
import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;
import org.misha.domain.client.impl.English;
import org.misha.domain.client.impl.Jewish;

public class KitchenTest {

    @Test
    public void testGetBreakfast() {
        Client english = new English(new Specification().addDish("porridge").addDish("milk"));
        Kitchen.breakfast(english).menu();
        Client jewish = new Jewish(new Specification().addDish("falafels").addDish("apple"));
        Kitchen.breakfast(jewish).menu();
        english = new English(new Specification().addDish("orange juice").addDish("ice cream"));
        Kitchen.breakfast(english).menu();
        jewish = new Jewish(new Specification().addDish("burekas").addDish("coffee"));
        Kitchen.breakfast(jewish).menu();
    }
}