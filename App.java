import de.telran.gateway.UserGateWay;
import de.telran.model.User;
import org.springframework.web.client.RestTemplate;

public class App {
    public static void main(String[] args) {
        UserGateWay gateWay = new UserGateWay(new RestTemplate());
        boolean isRegistered = gateWay.registerUser(createTestUser());

        System.out.println("Is registered?" + isRegistered);
    }
    private static User createTestUser(){
        User user = new User();
        user.setFirstName("Sergey");
        user.setLastName("Luckichev");
        user.setPassword("12345");
        user.setRepeatPassword("12345");
        user.setUsername("12345");
        return user;
    }
}
