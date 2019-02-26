package com.gildedrose;

public class UpdatesItemQuality {

    UpdatesItemsFactory updatesItemsFactory = new UpdatesItemsFactory();

    public Item updateItem(Item item) {
        return updatesItemsFactory.updateFor(item).update(item);
    }
}
