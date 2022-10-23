package shelest.lab1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shelest.lab1.controller.dto.UserInput;
import shelest.lab1.dao.UserDAO;
import shelest.lab1.model.User;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserDAO userDAO;

    @PostMapping
    public User create(@Valid @RequestBody UserInput userInput) {
        return userDAO.create(userInput);
    }

}
