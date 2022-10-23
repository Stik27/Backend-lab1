package shelest.lab1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shelest.lab1.controller.dto.RecordInput;
import shelest.lab1.dao.RecordDAO;
import shelest.lab1.model.Record;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/record")
public class RecordController {
    private final RecordDAO recordDAO;

    @PostMapping
    public Record create(@Valid @RequestBody RecordInput input) {
        return recordDAO.create(input);
    }

    @GetMapping("/{userId}")
    public List<Record> getRecordsByUserId(@PathVariable UUID userId) {
        return recordDAO.getAllRecordsByUserId(userId);
    }
    @GetMapping("/{typeId}/{userId}")
    public List<Record> getRecordsByTypeAndUserId(@PathVariable UUID typeId,
                                                  @PathVariable UUID userId) {
        return recordDAO.getRecordsByTypeAndUserId(typeId,userId);
    }
}
