package ru.innoreport.persistence.reportPersistence.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import ru.innoreport.persistence.reportPersistence.model.ReportDTO;

public interface ReportPersistenceRepository  extends MongoRepository<ReportDTO, String> {
//call the persistence application from this layer


}
