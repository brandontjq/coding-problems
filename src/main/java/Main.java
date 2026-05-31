import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CompletableFuture<String>> completableFutures = List.of(
               CompletableFuture.supplyAsync(
                        () -> {
                            try {
                                Thread.sleep(10000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            return "CF1";
                        }, executorService
                ),

        CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "CF2";
                }, executorService
        ),

         CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "CF3";
                }, executorService
            )
        );

        List<String> result = new ArrayList<>();
        for (CompletableFuture<String> completableFuture : completableFutures) {
            result.add(completableFuture.join());
        }
        System.out.println(result);
        executorService.shutdown();
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
