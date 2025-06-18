package com.nexora.hirepath.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job_applications")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_application_id")
    private Long jobApplicationId;

    @Column(name = "application_date", nullable = false, updatable = false)
    private LocalDate applicationDate;

    @Lob
    @Column(name = "comments")
    private String comments;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_application_status", nullable = false)
    private JobApplicationStatus status;

    @Column(name = "curriculum", nullable = false)
    private String curriculum;

    @Column(name = "file")
    private String file;

    @ManyToOne
    @JoinColumn(name = "job_vacancy_id", nullable = false, referencedColumnName = "job_vacancy_id")
    private JobVacancy jobVacancy;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User user;

    @PrePersist
    public void prePersist() {
        this.applicationDate = LocalDate.now();
        this.status = JobApplicationStatus.SUBMITTED;
    }

}
