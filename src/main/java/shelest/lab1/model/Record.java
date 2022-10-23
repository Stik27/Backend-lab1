package shelest.lab1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Record {
    @NonNull
    private UUID id;
    private UUID userId;
    private UUID typeId;
    private LocalDate timeCreate;
    private Integer amount;


}
