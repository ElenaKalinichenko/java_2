package lesson5;

import java.util.Arrays;

import static java.lang.Math.cos;
import static java.lang.StrictMath.sin;
import static java.lang.System.currentTimeMillis;

public class Main {


    public static void main(String[] args) {

         final int size = 10000000;
        final int THREADS_COUNT = 2;
        final int h = size / THREADS_COUNT;
        float[] arr = new float[size];

        long a = currentTimeMillis();
        Arrays.fill(arr, 1f);
        final float[][] m = new float[THREADS_COUNT][h];

        Thread[] t = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
//деления одного массива на два:
            System.arraycopy(arr, h * i, m[i], 0, h);
            final int u = i;
            t[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    // считаем массив со сдвигом
                    int n = u * h;
                    for (int j = 0; j < h; j++, n++) {
                        m[u][j] = (float) (m[u][j] * sin(0.2f + n / 5) * cos(0.2f + n / 5) * cos(0.4f + n / 2));
                    }
                }
            });
            t[i].start();
        }
        try {
            for (int i = 0; i < THREADS_COUNT; i++) {
                t[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // складываем массив обратно в исходный массив
        for (int i = 0; i < THREADS_COUNT; i++) {
            System.arraycopy(m[i], 0, arr, i * h, h);
        }
        // определяем время
        System.out.println(currentTimeMillis() - a);
    }
}

