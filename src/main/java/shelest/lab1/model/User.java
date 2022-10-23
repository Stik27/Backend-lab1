package shelest.lab1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class User {
    private UUID id;
    private String name;
    private Integer age;
}
