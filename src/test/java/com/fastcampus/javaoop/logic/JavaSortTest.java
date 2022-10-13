package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> list = new java.util.ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);
        List<Integer> actual = javaSort.sort(list);

        //then
        List<Integer> expected = new java.util.ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, actual);
    }
}