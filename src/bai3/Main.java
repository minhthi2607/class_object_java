package bai3;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        long sum = 0;
        for (long i = 0; i < 1000000000L; i++) {
            sum += i;
        }
        sw.stop();

        System.out.println("Thời gian chạy (ms): " + sw.getElapsedTime());
    }
}
