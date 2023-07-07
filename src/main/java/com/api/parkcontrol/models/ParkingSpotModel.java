package com.api.parkcontrol.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    @Getter @Setter
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    @Getter @Setter
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    @Getter @Setter
    private String brandCar;
    @Column(nullable = false, length = 70)
    @Getter @Setter
    private String modelCar;
    @Column(nullable = false, length = 70)
    @Getter @Setter
    private String colorCar;
    @Column(nullable = false)
    @Getter @Setter
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 150)
    @Getter @Setter
    private String responsibleName;
    @Column(nullable = false, length = 5)
    @Getter @Setter
    private String apartment;
    @Column(nullable = false, length = 5)
    @Getter @Setter
    private String block;
}
