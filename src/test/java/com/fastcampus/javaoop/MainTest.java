package com.fastcampus.javaoop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainTest {

    @Test
    void Main() {
        //given
        String[] args = {"3", "1", "2"};

        //when & then
        Main.main(args);
    }
}
