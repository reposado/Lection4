import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestAll {

    @BeforeEach
    void setUp() {
        System.out.println("Инициация");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Освобождение ресурсов");
    }

    @Test
    @DisplayName("Проверка сложения")
    void add() {
        assertEquals(10, Calculator.add(5,5));
        //System.out.println("caseDone");

    }
    /*@Test
    @DisplayName("Отрицательный кейс на сложение")
    void addFail() {
        assertEquals(9, Calculator.add(5, 5));
    }*/

    @Test
    @DisplayName("Проверка вычетания")
    void subs() {
        assertEquals(10, Calculator.subs(15, 5));
    }

    @Test
    @DisplayName("проверка умножения")
    void multi() {
        assertEquals(8, Calculator.multi(4, 2));
    }

    @Test
    @DisplayName("Проверка деления")
    void div() {
        assertEquals(4,Calculator.div(8,2));
    }
}