package ru.netology.stats.Statistics.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void monthMinSales() { // Номер месяца минимальных продаж.
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxSalesMonth() { // Номер месяца максимальных продаж.
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumAllSales() { // Сумма всех продаж.
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        long actualSales = service.sumAllSales(sale);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageAmountSalesMonth() { // Средняя сумма продаж в месяц.
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 15;
        long actualSale = service.averageAmountSalesMonth(sale);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void monthsBelowAverageSales() { // Кол-во месяцев, в которых продажи были ниже среднего.
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        long actualMonth = service.monthsBelowAverageSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthsAboveAveragSales() { // Кол-во месяцев, в которых продажи были выше среднего.
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        long actualMonth = service.monthsAboveAveragSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
