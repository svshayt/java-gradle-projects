package com.svshayt.java_util_stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamPeekDemoTest {
    private final StreamPeekDemo streamPeekDemo = new StreamPeekDemo();

    @Test
    void sumDoublesDivisibleBy3() {
        assertEquals(1554, streamPeekDemo.sumDoublesDivisibleBy3(100, 120));
    }

    @Test
    void sumV2DoublesDivisibleBy3() {
        assertEquals(1554, streamPeekDemo.sumV2DoublesDivisibleBy3(100, 120));
    }

    @Test
    void sumV3DoublesDivisibleBy3() {
        assertEquals(1554, streamPeekDemo.sumV3DoublesDivisibleBy3(100, 120));
    }
}