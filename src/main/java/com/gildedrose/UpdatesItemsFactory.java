package com.gildedrose;

public class UpdatesItemsFactory {
    public UpdatesItem updateFor(Item  item) {

        if (item.name == "Backstage passes")
            return new UpdatesSpecialEventItem();
        else
            return new UpdatesRegularItem();
    }
}
