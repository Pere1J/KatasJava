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
        var sut = fizzBuzz.execute(3);
        //then.... espero que FIZZ se el resultado de SUT (system under test)
        assertEquals("Fizz", sut);
       //assertEquals("(sut)", sut);
    }
    @Test
    void executeReturnsBuzzIfNumIsDivisibleBy5() {
        //given
        var fizzBuzz= new FizzBuzz();

        //when
        var sut = fizzBuzz.execute(5);
        //then.... espero que Buzz sea el resultado de SUT (system under test)
        assertEquals("Buzz", sut );
    }
    @Test
    void executeReturnsFizzBuzzIfNumIsDivisibleBy5And3() {
        //given
        var fizzBuzz= new FizzBuzz();

        //when
        var sut = fizzBuzz.execute(15);
        //then.... espero que Buzz sea el resultado de SUT (system under test)
        assertEquals("FizzBuzz", sut );


    }

    @Test
    void executeReturnsNumIfNumIsNotDivisibleBy5Or3() {
        //given
        var fizzBuzz= new FizzBuzz();

        //when
        var sut = fizzBuzz.execute(4);
        //then.... espero que Buzz sea el resultado de SUT (system under test)
        assertEquals("4", sut );


}
}