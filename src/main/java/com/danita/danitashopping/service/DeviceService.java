package com.danita.danitashopping.service;

import com.danita.danitashopping.model.Device;

import java.util.List;
/**
 * @author daniel Taye
 *
 */
public interface DeviceService {
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
