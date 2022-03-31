package ru.netology.sqr;

public class SQRService {
    public int calculationOfSquares(int start, int completion) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start)
                if (i * i <= completion)
                    counter++;
        }
        return counter;
    }
}