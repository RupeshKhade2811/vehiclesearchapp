package com.factory.appraisal.vehiclesearchapp.dto;


//kalyan
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalVehicleStereoStatus {


    @NotNull(message = "Factory Equipment Operational shouldn't be empty")
    private boolean factoryEquipmentOperational ;
    @NotNull(message = "Factory Equipment NotOperational shouldn't be empty")
    private boolean factoryEquipmentNotOperational ;
    @NotNull(message = "Knobs Missing shouldn't be empty")
    private boolean knobsMissing ;
    @NotNull(message = "After Market NavigationNice System shouldn't be empty")
    private boolean afterMarketNavigationNiceSystem ;
    @NotNull(message = "After Market shouldn't be empty")
    private boolean afterMarket;
    @NotNull(message = "After Market Rear Entertainment System shouldn't be empty")
    private boolean aftermarketRearEntertainmentSystem ;
    @NotNull(message = "Factory Rear Entertainment System shouldn't be empty")
    private boolean factoryRearEntertainmentSystem ;
    @NotNull(message = "Professional Install shouldn't be empty")
    private boolean professionalInstall ;
    @NotNull(message = "BrokenScreen shouldn't be empty")
    private boolean brokenScreen ;
    @NotNull(message = "FadedDisplayButtons shouldn't be empty")
    private boolean fadedDisplayButtons ;
    @NotNull(message = "NotOperational shouldn't be empty")
    private boolean notOperational ;
    @NotNull(message = "Operational shouldn't be empty")
    private boolean operational ;

}