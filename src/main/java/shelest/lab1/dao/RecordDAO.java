package shelest.lab1.dao;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shelest.lab1.controller.dto.RecordInput;
import shelest.lab1.exception.CustomException;
import shelest.lab1.exception.ErrorType;
import shelest.lab1.model.Record;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RecordDAO {
    private final List<Record> recordsList = new ArrayList<>();
    private final TypeDAO typeDAO;
    private final UserDAO userDAO;

    public Record create(RecordInput input) {
        if (!userDAO.exists(input.getUserId())) {
            throw new CustomException(ErrorType.NOT_FOUND, "This user not exists");
        }
        if (!typeDAO.exists(input.getTypeId())) {
            throw new CustomException(ErrorType.NOT_FOUND, "This type not exists");
        }
        Record record = new Record(UUID.randomUUID(), input.getUserId(), input.getTypeId(), LocalDate.now(), input.getCost());
        recordsList.add(record);
        return record;
    }

    public List<Record> getAllRecordsByUserId(UUID userId){
        return recordsList.stream().filter(record -> userId.equals(record.getUserId())).toList();
    }
    public List<Record> getRecordsByTypeAndUserId(UUID typeId,UUID userId){
        return recordsList.stream()
                .filter(record -> typeId.equals(record.getTypeId())&&userId.equals(record.getUserId()))
                .toList();
    }
}
