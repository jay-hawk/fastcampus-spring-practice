package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }

}
