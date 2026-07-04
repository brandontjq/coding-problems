import others.Employee;
import others.OrderService;
import others.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        String name = "Brandon";
        List<String> roles = new ArrayList<>();
        roles.add("Admin");
        Date joinDate = new Date();

        joinDate.setTime(100);
        Employee e1 = new Employee(name, roles, joinDate);
        System.out.println(e1.getName());
        roles.add("Guest");
        e1.getRoles().add("Guest");
        System.out.println(e1.getRoles());
        joinDate.setTime(1000002);
        System.out.println(e1.getJoiningDate());
//        long start = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        UserService userService = new UserService();
//        OrderService orderService = new OrderService();
//
//        CompletableFuture<String> userFuture =
//                CompletableFuture.supplyAsync(
//                        () -> userService.getUser(),
//                        executorService
//                );
//
//        CompletableFuture<String> orderFuture2 =
//                userService.getUserAsync()
//                        .thenCompose(userId -> orderService.getOrderAsync(userId));
//
//
//
//        CompletableFuture<String> orderFuture =
//                userFuture.thenApplyAsync(
//                        orderService::getOrder,
//                        executorService
//                );
//
//        String order = orderFuture.join();
//        String order2 = orderFuture2.join();
//
//
//
//        executorService.shutdown();
//        long end = System.currentTimeMillis();
//
//        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
