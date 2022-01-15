package com.rest.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rest.model.Device;
import com.rest.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceRestController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping(value = "{id}")
    public ResponseEntity<Device> getDevice(@PathVariable("id") Integer id_device) {
        if (id_device == null) {
            return new ResponseEntity<Device>(HttpStatus.BAD_REQUEST);
        }

        Device device = deviceService.getDevice(id_device);

        if (device == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Device>(device, HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Device> saveDevice(@RequestBody @Validated Device device){
        if (device == null){
            return new ResponseEntity<Device>(HttpStatus.BAD_REQUEST);
        }
        deviceService.save(device);

        return new ResponseEntity<Device> (device, HttpStatus.CREATED);
    }
    @PutMapping(value = "")
    public ResponseEntity<Device> updateDevice(@RequestBody @Validated Device device){
        if (device == null){
            return new ResponseEntity<Device>(HttpStatus.BAD_REQUEST);
        }
        deviceService.save(device);

        return new ResponseEntity<Device>(device, HttpStatus.OK);
    }
    @DeleteMapping(value = "{id}")
    public ResponseEntity<Device> deleteDevice(@PathVariable("id") Integer id_device){
        Device device = deviceService.getDevice(id_device);

        if (device == null){
            return new ResponseEntity<Device>(HttpStatus.NOT_FOUND);
        }

        deviceService.delete(id_device);

        return new ResponseEntity<Device>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Device>> getAllDevices(){
        List<Device> devices = deviceService.getAll();

        if (devices.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<List<Device>>(devices, HttpStatus.OK);
    }
}
