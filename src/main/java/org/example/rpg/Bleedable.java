package org.example.rpg;

import org.example.rpg.utils.Constant;

public interface Bleedable {


    default double bleed() {
        return Constant.BLEED_PERCENTAGE;
    }
}
