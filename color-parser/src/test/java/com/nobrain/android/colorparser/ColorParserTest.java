package com.nobrain.android.colorparser;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ColorParserTest {
    @org.junit.Test
    public void setDefaultColor() throws Exception {
        int defaultColor = 0x1f2f3f;
        ColorParser.setDefaultColor(defaultColor);
        int parsed = ColorParser.parse("xxxxxx");
        assertThat(parsed, is(equalTo(defaultColor)));

    }

    @org.junit.Test
    public void parse() throws Exception {
        int parsed = ColorParser.parse("#FF0000FF");
        assertThat(parsed, is(equalTo(0xFF0000FF)));

        parsed = ColorParser.parse("#0000FF");
        assertThat(parsed, is(equalTo(0xFF0000FF)));

        parsed = ColorParser.parse("#F00F");
        assertThat(parsed, is(equalTo(0xFF0000FF)));

        parsed = ColorParser.parse("#00F");
        assertThat(parsed, is(equalTo(0xFF0000FF)));

        parsed = ColorParser.parse("blue");
        assertThat(parsed, is(equalTo(0xFF0000FF)));
    }

}