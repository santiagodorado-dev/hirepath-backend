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
@Table(name = "job_vacancies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JobVacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_vacancy_id")
    private Long jobVacancyId;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "published_at", nullable = false, updatable = false)
    private LocalDate publishedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_vacancy_status", nullable = false)
    private JobVacancyStatus status;

    @Column(name = "featured", nullable = false)
    private Boolean featured;

    @Column(name = "image_url", length = 200)
    private String imageUrl;

    @Lob
    @Column(name = "details", nullable = false)
    private String details;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false, referencedColumnName = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false, referencedColumnName = "category_id")
    private Category category;

    @PrePersist
    public void prePersist() {
        this.publishedAt = LocalDate.now();
        this.status = JobVacancyStatus.ACTIVE;
        this.featured = false;
    }

}
