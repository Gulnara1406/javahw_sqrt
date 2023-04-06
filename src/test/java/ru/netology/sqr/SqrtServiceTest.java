package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {
    @ParameterizedTest()
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void testInLimit(int expected, int a, int x) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(a, x);
        Assertions.assertEquals(expected, actual);
    }
}
