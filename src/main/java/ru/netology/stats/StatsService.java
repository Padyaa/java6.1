package ru.netology.stats;

public class StatsService {

    public long sumMonthSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (int) sum;
    }

    public long averageMonthSales(long[] sales) {

        return sumMonthSales(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int overAverengeSales(long[] sales) {
        long ave = averageMonthSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > ave) {
                month++;
            }
        }
        return month;
    }

    public int underAverengeSales(long[] sales) {
        long aver = averageMonthSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < aver) {
                month++;
            }
        }
        return month;
    }
}
