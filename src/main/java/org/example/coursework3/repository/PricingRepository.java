package org.example.coursework3.repository;

import org.example.coursework3.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PricingRepository extends JpaRepository<Pricing, String> {

    Optional<Pricing> findBySpecialistIdAndDurationAndType(
            String specialistId,
            Integer duration,
            String type
    );

    Optional<Pricing> findFirstBySpecialistIdAndDurationOrderByCreatedAtDesc(
            String specialistId,
            Integer duration
    );

    Optional<Pricing> findFirstBySpecialistIdAndTypeOrderByCreatedAtDesc(
            String specialistId,
            String type
    );

    Optional<Pricing> findFirstBySpecialistIdOrderByCreatedAtDesc(String specialistId);
}
