package ru.magomedov.environmentalSensors.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.magomedov.environmentalSensors.models.Sensor;
import ru.magomedov.environmentalSensors.repositories.SensorRepository;

import java.util.Optional;


@Service
@Transactional(readOnly = true)
public class SensorService {

    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Optional<Sensor> findByName(String name) {  //получить датчик по имени
        return sensorRepository.findByName(name);
    }

    @Transactional
    public void register(Sensor sensor) {  //сохранить датчик
        sensorRepository.save(sensor);
    }
}
