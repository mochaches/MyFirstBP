package com.github.mochachess.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "pd_view_logging")
@Entity
public class PdViewLogging {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "visiting_time", nullable = false)
    private LocalDate visitingTime;

    @Column(name = "details", nullable = false)
    private String details;

    public PdViewLogging(String userName, String details) {
        this.userName = userName;
        this.visitingTime = LocalDate.now();
        this.details = details;
    }

    public PdViewLogging() {

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setVisitingTime(LocalDate visitingTime) {
        this.visitingTime = visitingTime;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getVisitingTime() {
        return visitingTime;
    }

    public String getDetails() {
        return details;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
