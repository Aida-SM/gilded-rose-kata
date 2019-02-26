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
       // item = new Item("foo", 0, 0);
    }


    @Test
    public void shouldCreateUpdatedItemWhenItemIsBackstage_passes_to_a_TAFKAL80ETC_concert() {

        item = new Item("Backstage passes", 0, 0);
        Assert.assertThat(updatesItemsFactory.updateFor(item), instanceOf(UpdatesSpecialEventItem.class));
    }

    @Test
    public void shouldCreateUpdatedItemWhenItemIsRegular_Item() {

        item = new Item("foo ", 0, 0);
        Assert.assertThat(updatesItemsFactory.updateFor(item), instanceOf(UpdatesRegularItem.class));
    }

    @Test
    public void shouldCreateUpdatedItemWhenItemIsAged_Brie() {

        item = new Item("Aged Brie", 0, 0);
        Assert.assertThat(updatesItemsFactory.updateFor(item), instanceOf(UpdatesRegularItem.class));
    }

    @Test
    public void shouldCreateUpdatedItemWhenItemIsSulfuras_Hand_of_Ragnaros() {

        item = new Item("Sulfuras, Hand of Ragnaros", 0, 0);
        Assert.assertThat(updatesItemsFactory.updateFor(item), instanceOf(UpdatesUnchangingItem.class));
    }










}