package ru.magomedov.environmentalSensors.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.magomedov.environmentalSensors.models.Measurement;


@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
