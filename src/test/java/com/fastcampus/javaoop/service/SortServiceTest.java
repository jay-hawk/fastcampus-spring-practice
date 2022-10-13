package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test() {
        //given


        //when
        List<String> list = new java.util.ArrayList<>();
        list.add("3");
        list.add("2");
        list.add("1");
        List<String> actual = sut.doSort(list);

        //then
        List<String> expected = new java.util.ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        assertEquals(expected, actual);
    }
}