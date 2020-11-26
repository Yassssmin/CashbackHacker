package ru.netology.servise;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void testRemainMiddle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void testRemaintestZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}