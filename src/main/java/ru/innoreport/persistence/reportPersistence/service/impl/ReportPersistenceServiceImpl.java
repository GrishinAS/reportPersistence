package ru.innoreport.persistence.reportPersistence.service.impl;

import org.springframework.stereotype.Service;
import ru.innoreport.persistence.reportPersistence.model.ReportDTO;
import ru.innoreport.persistence.reportPersistence.service.ReportPersistenceService;

import java.util.List;

@Service
class ReportPersistenceServiceImpl implements ReportPersistenceService {

   /* @Autowired
    AuthorizationRepository authorizationRepository;*/

    @Override
    public int method() {
        return 1;
    }

    public List<ReportDTO> getReportsHistory(String name) {
        return null;
    }
}
