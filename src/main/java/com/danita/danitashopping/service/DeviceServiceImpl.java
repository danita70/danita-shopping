package com.danita.danitashopping.service;

import com.danita.danitashopping.model.Device;
import com.danita.danitashopping.repository.DeviceRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
/**
 * @author daniel Taye
 *
 */
@Service
public class DeviceServiceImpl implements DeviceService
{
    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository)
    {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device)
    {
        device.setCreatedTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id)
    {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices()
    {
        return deviceRepository.findAll();
    }
}
