package com.gildedrose;

public class UpdatesItemsFactory {
    public UpdatesItem updateFor(Item  item) {

        if (item.name == "Backstage passes")
            return new UpdatesSpecialEventItem();
        else if (item.name == "Aged Brie")
            return new UpdatesQualityIncreasingItem();
        else if (item.name == "Sulfuras, Hand of Ragnaros")
            return new UpdatesUnchangingItem();
        else
            return new UpdatesRegularItem();
    }
}
