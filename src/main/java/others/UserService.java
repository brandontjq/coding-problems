package others;

public class UserService {

    public String getUser() {
        try {
            System.out.println("Getting User");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "User";
    }
}
