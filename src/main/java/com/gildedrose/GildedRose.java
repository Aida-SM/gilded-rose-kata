package com.gildedrose;

class GildedRose {
    Item[] items;
    private UpdatesItemQuality updatesItemQuality = new UpdatesItemQuality();

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
            for (int i = 0; i < items.length; i++) {
                items[i] = updatesItemQuality.updateItem(items[i]);
        }
    }
}