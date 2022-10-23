package shelest.lab1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shelest.lab1.controller.dto.RecordInput;
import shelest.lab1.controller.dto.TypeInput;
import shelest.lab1.controller.dto.UserInput;
import shelest.lab1.dao.RecordDAO;
import shelest.lab1.dao.TypeDAO;
import shelest.lab1.dao.UserDAO;
import shelest.lab1.model.Record;
import shelest.lab1.model.Type;
import shelest.lab1.model.User;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/type")
public class TypeController {

    private final TypeDAO typeDAO;

    @PostMapping
    public Type create(@Valid @RequestBody TypeInput input) {
        return typeDAO.create(input);
    }

    @GetMapping
    public List<Type> getAllTypes() {
        return typeDAO.getAllTypes();
    }

}
