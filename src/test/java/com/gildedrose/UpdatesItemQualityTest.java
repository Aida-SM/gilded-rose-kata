package com.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdatesItemQualityTest {
    @Test
    public void shouldReturnUpdateItem() {

        UpdatesItemQuality updatesItemQuality = new UpdatesItemQuality();
        Item item = new Item("foo", 0, 0);
         updatesItemQuality.updateItem(item);
        Assert.assertEquals(item,updatesItemQuality.updateItem(item));
    }
}