package ru.netology.sqr;

public class SQRService {
    public int calculateSumSqr(long lower, long upper) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lower) {
                if (i * i <= upper) {
                    counter = counter + 1;
                }
            }
        }
        return (counter);
    }
}
