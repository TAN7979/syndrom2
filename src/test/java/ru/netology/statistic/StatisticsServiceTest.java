package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expectedMax = 12;

        long actualMax = service.findMax(incomesInBillions);

        assertEquals(expectedMax, actualMax);
    }
    @Test
    void findMaxMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 20, 5, 3, 8, 6, 11, 11, 12};
        long expectedMaxMax = 20;

        long actualMaxMax = service.findMax(incomesInBillions);

        assertEquals(expectedMaxMax, actualMaxMax);
    }
}
