package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int a, int x) {
        int k = 0; //счетчик кол-ва чисел
        for (int i = 10; i <= 99; i++) {
            if (Math.pow(i, 2) >= a && Math.pow(i, 2) <= x) {
                k += 1;
            }
        }
        return k;
    }
}
