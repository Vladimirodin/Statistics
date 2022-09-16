package ru.netology.stats.Statistics.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 180;
        long actualDay = service.sumAllSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void averageAmountSalesMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 15;
        long actualDay = service.averageAmountSalesMonth(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthsBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        long actualDay = service.monthsBelowAverageSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthsAboveAveragSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        long actualDay = service.monthsAboveAveragSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
