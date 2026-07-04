package others;

import java.util.concurrent.CompletableFuture;

public class UserService {

    public String getUser() {
        try {
            System.out.println("Getting User");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "User1";
    }

    public CompletableFuture<String> getUserAsync() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Getting User");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "UserAsync";
        });
    }
}
