package shelest.lab1.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserInput {
    @NotBlank
    private String name;
    @NotNull
    private Integer age;
}
