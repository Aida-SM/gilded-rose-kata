package com.gildedrose;

public class QualityAdjuster {

    public int adjust(Item item, int amountOfIncreement) {
            int newQuality = 0;
            if (item.sellIn > 0)
                newQuality = item.quality + amountOfIncreement;
            return newQuality;
    }
}
