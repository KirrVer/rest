package com.rest.service;

import com.rest.model.Device;

import java.util.List;

public interface DeviceService {

    Device getDevice(Integer id_device);

    void save(Device device);

    void delete(int id_device);

    List<Device> getAll();

}
