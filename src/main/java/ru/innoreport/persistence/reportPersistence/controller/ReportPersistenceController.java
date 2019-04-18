package ru.innoreport.persistence.reportPersistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.innoreport.persistence.reportPersistence.dao.ReportPersistenceRepository;
import ru.innoreport.persistence.reportPersistence.model.ReportDTO;
import ru.innoreport.persistence.reportPersistence.service.ReportPersistenceService;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/reports")
public class ReportPersistenceController {

    @Autowired
    ReportPersistenceRepository reportPersistenceRepository;

    @RequestMapping("/all")
    public List<ReportDTO> getReportsHistory(){
        //return Collections.singletonList(new ReportDTO(1,"Бачок потiк", "Жопа", "in_progress"));
        return reportPersistenceRepository.findAll();
    }
    @RequestMapping("/{user_id}")
    public List<ReportDTO> getReportsHistory(@PathVariable("user_id") String user_id){
        return Collections.singletonList(new ReportDTO(1,"Бачок потiк", "Жизнь за нерзула", "in_progress"));
    }

    @RequestMapping(value = "/createreport", method = RequestMethod.POST)
    public ReportDTO create(@RequestBody ReportDTO report) {
        return reportPersistenceRepository.save(report);
    }
}