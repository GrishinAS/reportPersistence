package ru.innoreport.persistence.reportPersistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Reports")
public class ReportDTO {
    @Id
    private int _id;
    private String title;
    private String description;

    public ReportDTO(int _id, String title, String description, String status) {
        this._id = _id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public ReportDTO() {
    }

    private String status;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
enum Status {
    received,
    in_progress,
    solved,
    declined
}
