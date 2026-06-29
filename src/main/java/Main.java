import others.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        UserService userService = new UserService();
        CompletableFuture<String> completableFutureUser = CompletableFuture.supplyAsync(() -> userService.getUser(), executorService);

        CompletableFuture.allOf(completableFutureUser).join();

        String user = completableFutureUser.join();



        executorService.shutdown();
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
