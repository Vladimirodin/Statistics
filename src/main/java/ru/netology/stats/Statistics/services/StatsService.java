package ru.netology.stats.Statistics.services;


public class StatsService {

    public int minSales(long[] sales) { // Номер месяца минимальных продаж.
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { // Номер месяца максимальных продаж.
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long sumAllSales(long[] sales) { // Сумма всех продаж.
        long sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }
        return sumSale;
    }

    public long averageAmountSalesMonth(long[] sales) { // Средняя сумма продаж в месяц.
        long averageSum = sumAllSales(sales) / sales.length;

        return averageSum;
    }
    public long monthsBelowAverageSales(long[] sales) { // Кол-во месяцев, в которых продажи были ниже среднего.
        long averageSum = averageAmountSalesMonth(sales);
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                belowAverage += 1;
            }
        }
        return  belowAverage;

    }
    public long monthsAboveAveragSales(long[] sales) { // Кол-во месяцев, в которых продажи были выше среднего.
        long averageSum = averageAmountSalesMonth(sales);
        int aboveAverag = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                aboveAverag += 1;
            }
        }
        return aboveAverag;
    }
}
