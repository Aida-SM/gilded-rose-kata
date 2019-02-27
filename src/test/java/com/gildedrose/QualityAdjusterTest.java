package com.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QualityAdjusterTest {
    QualityAdjuster qualityAdjuster;
    Item item;
    int amountOfIncreement ;

    @Before
    public void setUp() throws Exception {
        qualityAdjuster = new QualityAdjuster();
        item = new Item("foo", 1, 0);
        amountOfIncreement = 2 ;

    }

    @Test
    public void shouldReturnNewQuality() {
        int newQuality = qualityAdjuster.adjust(item,2);
        Assert.assertEquals(0, newQuality);
    }

    @Test
    public void shouldReturnNewQualityWhenSellInIsBiggerThanZero() {
        Assert.assertEquals(2, qualityAdjuster.adjust(item,amountOfIncreement));
    }





}