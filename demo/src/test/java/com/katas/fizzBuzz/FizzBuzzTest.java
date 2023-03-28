package com.katas.fizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void executeReturnsFizzIfNumIsDivisibleBy3() {
        //given
        var fizzBuzz= new FizzBuzz();

        //when
        var sut = fizzBuzz.execute(5);
        //then
        assertEquals("Fizz", sut);

    }
}