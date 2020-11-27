package ru.netology.servise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {

    @Test
    public void testRemainOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemainMiddle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}