package com.rest.service;

import com.rest.model.Device;
import com.rest.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public Device getDevice(Integer id_device) {
        return deviceRepository.getById(id_device);
    }

    @Override
    public void save(Device device) {
        deviceRepository.save(device);
    }

    @Override
    public void delete(int id_device) {
        deviceRepository.deleteById(id_device);
    }

    @Override
    public List<Device> getAll() {

        return deviceRepository.findAll();
    }
}
