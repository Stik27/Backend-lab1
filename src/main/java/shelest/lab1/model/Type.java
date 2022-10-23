package shelest.lab1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class Type {
    private UUID id;
    private String name;
}
