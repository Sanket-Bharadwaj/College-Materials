import java.util.ArrayList;
import java.util.Date;

public class MemoryIntensiveTest {
    public static void main(String[] args) {
        ArrayList<Object[]> memoryHog = new ArrayList<>();

        Runtime runtime = Runtime.getRuntime();

        for (int i = 0; i < 100000; i++) {
            // Allocate arrays to consume memory
            memoryHog.add(new Object[10000]);

            if (i % 1000 == 0) {
                printMemoryStats(runtime, i);
                try {
                    Thread.sleep(100); // Slow down to observe GC
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void printMemoryStats(Runtime runtime, int iteration) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.printf("[%s] Iteration: %d | Total: %.2f MB | Used: %.2f MB | Free: %.2f MB%n",
                new Date(),
                iteration,
                totalMemory / (1024.0 * 1024),
                usedMemory / (1024.0 * 1024),
                freeMemory / (1024.0 * 1024));
    }
}
