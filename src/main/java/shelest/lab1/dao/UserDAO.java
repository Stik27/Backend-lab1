package shelest.lab1.dao;

import org.springframework.stereotype.Service;
import shelest.lab1.controller.dto.UserInput;
import shelest.lab1.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserDAO {
    private final List<User> usersList = new ArrayList<>();

    public User create(UserInput userInput) {
        User user = new User(UUID.randomUUID(), userInput.getName(), userInput.getAge());
        usersList.add(user);
        return user;
    }

    boolean exists(UUID id) {
        Optional<User> any = usersList.stream().filter(userL -> userL.getId().equals(id)).findAny();
        return any.isPresent();
    }
}

