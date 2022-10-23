package shelest.lab1.dao;

import org.springframework.stereotype.Service;
import shelest.lab1.controller.dto.TypeInput;
import shelest.lab1.controller.dto.UserInput;
import shelest.lab1.model.Type;
import shelest.lab1.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TypeDAO {
    private final List<Type> typesList = new ArrayList<>();

    public Type create(TypeInput input) {
        Type type = new Type(UUID.randomUUID(), input.getName());
        typesList.add(type);
        return type;
    }

    public List<Type> getAllTypes() {
        return typesList;
    }

    boolean exists(UUID id) {
        Optional<Type> any = typesList.stream().filter(userL -> userL.getId().equals(id)).findAny();
        return any.isPresent();
    }
}

