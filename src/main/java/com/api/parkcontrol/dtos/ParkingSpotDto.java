package com.api.parkcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class ParkingSpotDto {
    @NotBlank
    @Size(max = 7)
    @Getter @Setter
    private String parkingSpotNumber;
    @Getter @Setter
    private String licensePlateCar;
    @NotBlank
    @Getter @Setter
    private String brandCar;
    @NotBlank
    @Getter @Setter
    private String modelCar;
    @NotBlank
    @Getter @Setter
    private String colorCar;
    @NotBlank
    @Getter @Setter
    private String responsibleName;
    @NotBlank
    @Getter @Setter
    private String apartment;
    @NotBlank
    @Getter @Setter
    private String block;
}
