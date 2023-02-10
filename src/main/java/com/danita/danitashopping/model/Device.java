package com.danita.danitashopping.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
/**
 * @author daniel Taye
 *
 */
@Data
@Entity
@Table(name="device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false, length = 100)
    private String name;

    @Column(name="description", nullable = false, length = 100)
    private String description;

    @Column(name="price", nullable = false, length = 100)
    private Double price;

    @Column(name="created_time", nullable = false )
    private LocalDateTime createdTime;

    @Enumerated(EnumType.STRING)
    @Column(name="device_type", nullable = false)
    private DeviceType deviceType;

    //@OneToMany(fetch=FetchType.LAZY, mappedBy = "device")
    //private Set<Purchase> purchaseList;
}
