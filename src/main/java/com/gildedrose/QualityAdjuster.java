package com.gildedrose;

public class QualityAdjuster {

    public int adjust(Item item, int amountOfIncrement) {
            int newQuality ;
            if (item.sellIn > 0)
                newQuality = item.quality + amountOfIncrement;
            else
                newQuality= item.quality + amountOfIncrement*2;
            if (amountOfIncrement <0)
                return Math.max(newQuality, 0);
            else
                return newQuality;
    }
}
