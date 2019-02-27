package com.gildedrose;

public class UpdatesRegularItem implements UpdatesItem {
    @Override
    public Item update(Item item) {
        return new Item(item.name, item.sellIn - 1, new QualityAdjuster().adjust(item, - 1));

    }
}
