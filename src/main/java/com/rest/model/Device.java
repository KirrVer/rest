package com.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "devices")
@Getter
@Setter
@ToString
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_device")
    private int id_device;
    @Column(name = "latitude")
    private int latitude;
    @Column(name = "longitude")
    private int longitude;


}
