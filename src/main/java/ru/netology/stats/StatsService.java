package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long averageMonthSale(long[] sales) {
        return sum(sales) / 12;
    }

    public int maxSaleMonth(long[] sales) {
        long maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minSaleMonth(long[] sales) {
        long minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int monthsLowerAverage(long[] sales) {
        long avarage = averageMonthSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < avarage) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherAverage(long[] sales) {
        long avarage = averageMonthSale(sales);
        int countera = 0;
        for (long sale : sales) {
            if (sale > avarage) {
                countera++;
            }
        }
        return countera;
    }
}
