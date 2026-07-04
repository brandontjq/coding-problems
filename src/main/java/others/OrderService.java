package others;

import java.util.concurrent.CompletableFuture;

public class OrderService {

    public String getOrder(String userId) {
        try {
            System.out.println("Getting Order for User " + userId);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Order";
    }

    public CompletableFuture<String> getOrderAsync(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Getting Order for User " + userId);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "OrderAsync";
        });
    }
}
