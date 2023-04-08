package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int lBound, int rBound) {
        int numAmount = 0; //счетчик кол-ва чисел
        for (int i = 10; i <= 99; i++) {
            if (Math.pow(i, 2) >= lBound && Math.pow(i, 2) <= rBound) {
                numAmount += 1;
            }
        }
        return numAmount;
    }
}
