package ru.myst.spring.ProjectSensor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myst.spring.ProjectSensor.models.Measurement;
import ru.myst.spring.ProjectSensor.repositories.MeasurementRepository;

import java.time.LocalDateTime;
import java.util.List;


@Service
@Transactional(readOnly = true)
public class MeasurementService {

    private final MeasurementRepository measurementRepository;
    private final SensorService sensorService;

    @Autowired
    public MeasurementService(MeasurementRepository measurementRepository, SensorService sensorService) {
        this.measurementRepository = measurementRepository;
        this.sensorService = sensorService;
    }

    public List<Measurement> findAll() {
        return measurementRepository.findAll();
    }

    @Transactional
    public void save(Measurement measurement) {
        measurement.setSensor(sensorService.getSensorByName(measurement.getSensor().getName()).get());
        measurement.setDateTime(LocalDateTime.now());
        measurementRepository.save(measurement);
    }
}
