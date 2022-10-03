package ru.netology.sqr;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SQRServiceTest {

    private AssertJUnit Assertions;

    @Test
    public void Test() {
        SQRService service = new SQRService();
        int actual = service.calculate(150, 450);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
}
