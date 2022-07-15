package com.example.codelionwork;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeLionWorkApplicationTests {

    /*@Test
    void contextLoads() {

    }*/

    @Test
    public void 더하기테스트(){
        int rs = Calculator.add(1,2);

        assertEquals(3, rs);
    }

    @Test
    public void 빼기테스트(){
        int rs = Calculator.sub(1,2);

        assertEquals(-1, rs);
    }

    @Test
    public void 곱하기테스트(){
        int rs = Calculator.mul(1,2);

        assertEquals(2, rs);
    }

    @Test
    public void 나누기테스트(){
        int rs = Calculator.div(4,2);

        assertEquals(2, rs);
    }


    @Test
    public void 테스트1(){
        int rs = Calculator.test1(1,2, 3);

        assertEquals(6, rs);
    }

    @Test
    public void 테스트2(){
        int rs = Calculator.test2(1,2, 3);

        assertEquals(7, rs);
    }

    @Test
    public void 테스트3(){
        int rs = Calculator.test3(1,2, 3);

        assertEquals(9, rs);
    }
}
