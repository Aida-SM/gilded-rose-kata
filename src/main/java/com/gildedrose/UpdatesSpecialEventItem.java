package com.gildedrose;

public class UpdatesSpecialEventItem implements UpdatesItem{
    @Override
    public Item update(Item item) {
        int newQuality = 2;
        return new Item(item.name, item.sellIn - 1, Math.min(newQuality, 50));
    }
}
