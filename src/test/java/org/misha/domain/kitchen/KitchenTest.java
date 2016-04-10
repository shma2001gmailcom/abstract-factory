package org.misha.domain.kitchen;

import org.junit.Test;
import org.misha.domain.breakfast.Specification;
import org.misha.domain.client.Client;
import org.misha.domain.client.impl.English;
import org.misha.domain.client.impl.Jewish;

public class KitchenTest {
    @Test
    public void testGetBreakfast() {
        Client english = new English(new Specification() {
            @Override
            public String getFirst() {
                return "porridge";
            }

            @Override
            public String getSecond() {
                return "milk";
            }
        });
        KitchenMap.getBreakfast(english).menu();
        Client jewish = new Jewish(new Specification() {
            @Override
            public String getFirst() {
                return "falafels";
            }

            @Override
            public String getSecond() {
                return "apple";
            }
        });
        KitchenMap.getBreakfast(jewish).menu();
        english = new English(new Specification() {
            @Override
            public String getFirst() {
                return "orange juice";
            }

            @Override
            public String getSecond() {
                return "ice cream";
            }
        }
        );
        Kitchen.breakfast(english).menu();
        jewish = new Jewish(new Specification() {
            @Override
            public String getFirst() {
                return "burekas";
            }

            @Override
            public String getSecond() {
                return "coffee";
            }
        }
        );
        Kitchen.breakfast(jewish).menu();
    }
}