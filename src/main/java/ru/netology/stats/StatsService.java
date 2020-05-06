package ru.netology.stats;

public class StatsService {
    public int calculateTotal(int[] sales) { //Сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int calculateAverage(int[] monthlySales) { //Средняя сумма продаж в месяц
        int averageSum = calculateTotal(monthlySales);

        return averageSum / 12;
    }


    public int findMonthMax(int[] sales) { // Номер месяца с пиком продаж
        int monthMax = 0;
        int maxSale = sales [0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                monthMax = i;
            }
        }
        return monthMax + 1;
    }


    public int findMonthMin(int[] sales) { // Номер месяца с минимумом продаж
        int monthMin = 0;
        int minSale = sales [0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                monthMin = i;
            }
        }
        return monthMin + 1;

    }


    public int calculateMonthBelowAverage(int[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        int monthAverage = calculateAverage(sales);
        int amountBelow = 0;
        for (int sale : sales) {
            if (sale < monthAverage) {
                sale = 1;
                amountBelow++;
            }
        }
        return amountBelow;
    }


    public int calculateMonthAboveAverage(int[] sales) { //Кол-во месяцев, в которых продажи были выше среднего
        int monthAverage = calculateAverage(sales);
        int amountAbove = 0;
        for (int sale : sales) {
            if (sale > monthAverage) {
                sale = 1;
                amountAbove++;
            }
        }
        return amountAbove;
    }
}

