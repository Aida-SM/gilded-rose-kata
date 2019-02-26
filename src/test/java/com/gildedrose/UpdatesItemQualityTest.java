package com.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class UpdatesItemQualityTest {
    Item item;

    @Before
    public void setUp() throws Exception {
         item = new Item("foo", 0, 0);
    }

    @Test
    public void updateItem_shouldReturnUpdateItem() {

        UpdatesItemQuality updatesItemQuality = new UpdatesItemQuality();
       Assert.assertEquals(item,updatesItemQuality.updateItem(item));
    }

    @Test
    public void updateFor_shouldReturnAnUpdatesItem() {
        UpdatesItemsFactory updatesItemsFactory = new UpdatesItemsFactory();
        UpdatesItem updatesItem = updatesItemsFactory.updateFor(item);
        Assert.assertEquals(item, updatesItem.update(item));

    }


    }
