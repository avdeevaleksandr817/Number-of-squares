package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculationOfSquares() {
        SQRService service = new SQRService();
        int start = 200;
        int completion = 300;
        int expected = 3;
        int actual = service.calculationOfSquares(start, completion);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculationOfSquaresZero() {
        SQRService service = new SQRService();
        int start = 99;
        int completion = 99;
        int expected = 0;
        int actual = service.calculationOfSquares(start, completion);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculationOfSquaresAll() {
        SQRService service = new SQRService();
        int start = 99;
        int completion = 9801;
        int expected = 90;
        int actual = service.calculationOfSquares(start, completion);
        assertEquals(expected, actual);
    }
}