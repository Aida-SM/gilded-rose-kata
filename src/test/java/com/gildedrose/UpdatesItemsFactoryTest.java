package com.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class UpdatesItemsFactoryTest {
    Item item;
    UpdatesItemsFactory updatesItemsFactory;

    @Before
    public void setUp() throws Exception {
        updatesItemsFactory = new UpdatesItemsFactory();
        item = new Item("foo", 0, 0);
    }

    @Test
    public void updateFor_shouldReturnAnUpdatesItem() {
        UpdatesItem updatesItem = updatesItemsFactory.updateFor(item);
        Assert.assertEquals(item, updatesItem.update(item));
    }

    @Test
    public void shouldCreateUpdatedItemWhenItemIsBackstage_passes_to_a_TAFKAL80ETC_concert() {

        item = new Item("Backstage passes ", 0, 0);
        Assert.assertThat(updatesItemsFactory.updateFor(item), instanceOf(UpdatesSpecialEventItem.class));

    }

}