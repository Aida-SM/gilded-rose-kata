package com.gildedrose;

public class UpdatesItemsFactory {
    public UpdatesItem updateFor(Item item) {


        return new UpdatesRegularItem();
    }
}
