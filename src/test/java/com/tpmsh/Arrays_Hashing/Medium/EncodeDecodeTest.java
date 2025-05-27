package com.tpmsh.Arrays_Hashing.Medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class EncodeDecodeTest {

    StringUsageMedium solution;

    @BeforeEach
    void setUp() {
        this.solution = new StringUsageMedium();
    }

    @Test
    void encode() {
        // arrange
        List<String > input = List.of("neet","code","love","you");
        // act
        String actual = solution.encode(input);
        // assert
        String expected = "4;neet4;code4;love3;you";
        assertEquals(expected, actual);
    }

    @Test
    void decode() {
        // arrange
        String input = "4;neet4;code4;love3;you";
        // act
        List<String> actual = solution.decode(input);
        // assert
        List<String > expected = List.of("neet","code","love","you");
        assertEquals(expected, actual);
    }
}