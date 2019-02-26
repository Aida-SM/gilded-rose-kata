package com.gildedrose;

public class UpdatesItemsFactory {
    public UpdatesItem updateFor(Item  item) {

        if (item.name == "Backstage passes to a TAFKAL80ETC concert")
            return new UpdatesSpecialEventItem();
        else
            return new UpdatesRegularItem();
    }
}
