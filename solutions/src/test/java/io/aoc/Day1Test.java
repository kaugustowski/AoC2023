package io.aoc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @ParameterizedTest
    @CsvSource({"(()),0", "()(),0",
            "(((,3", "(()(()(,3", "))(((((,3",
            "()),-1", "))(,-1", "))),-3", ")())()),-3",
            "((())((())()()((,4"
    })
    void shouldReturnResult(String input, int expected) {
        //given
        Day1.Day1Solution day1Solution = new Day1.Day1Solution();

        //when
        int actual = day1Solution.result(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }


    @ParameterizedTest
    @CsvSource({"()()),5", "),1", "((((((()))))))),15"})
    void shouldReturnResult2(String input, int expected) {
        //given
        Day1.Day1Solution day1Solution = new Day1.Day1Solution();

        //when
        int actual = day1Solution.resultPart2(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }


}