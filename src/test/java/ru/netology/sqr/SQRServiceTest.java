package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "given range 200-300,200,300",
                    "given range 101-324,101,324"
            }
    )
    void should(String test, long lower, long upper) {
        SQRService service = new SQRService();
        long actual = service.calculateSumSqr(lower, upper);
        System.out.println("Количество чисел,попавших в диапазон: " + actual);
    }
}