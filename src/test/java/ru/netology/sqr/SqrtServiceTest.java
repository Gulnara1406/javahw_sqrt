package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {
    @ParameterizedTest()
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void testInLimit(int expected, int lBound, int rBound) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(lBound, rBound);
        Assertions.assertEquals(expected, actual);
    }
}
