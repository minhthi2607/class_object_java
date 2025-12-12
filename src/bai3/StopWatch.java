package bai3;

public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Getter
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Bắt đầu lại
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Kết thúc
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
