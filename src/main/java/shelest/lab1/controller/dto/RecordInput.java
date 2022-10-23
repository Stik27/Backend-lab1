package shelest.lab1.controller.dto;

import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
public class RecordInput {
    @NonNull
    private UUID userId;
    @NonNull
    private UUID typeId;
    @NonNull
    private Integer cost;

}
