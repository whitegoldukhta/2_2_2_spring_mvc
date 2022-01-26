package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(1, "Tom", "Edison"));
        users.add(new User(2, "Mark", "Zuckerberg"));
        users.add(new User(3, "Mikle", "Jordan"));
    }

    public List<User> index() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
