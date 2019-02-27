package com.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QualityAdjusterTest {

    @Test
    public void shouldReturnNewQuality() {
        QualityAdjuster qualityAdjuster = new QualityAdjuster();
        Item item = new Item("foo", 0, 0);
        int newQuality = qualityAdjuster.adjust(item,2);
        Assert.assertEquals(0, newQuality);
    }
}