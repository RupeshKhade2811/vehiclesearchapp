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
public class AppraisalVehicleOilCondition {

    @NotNull(message = "Clean Oil shouldn't be empty")
    private boolean cleanOil ;
    @NotNull(message = "Dirty Oil shouldn't be empty")
    private boolean dirtyOil ;
    @NotNull(message = "Water In Oil shouldn't be empty")
    private boolean waterInOil;
    @NotNull(message = "Correct Level shouldn't be empty")
    private boolean correctLevel ;
    @NotNull(message = "One Quart Low shouldn't be empty")
    private boolean  oneQuartLow ;
    @NotNull(message = "More Than A Quart Low shouldn't be empty")
    private boolean moreThanAQuartLow ;
    @NotNull(message = "Electronic Gauge shouldn't be empty")
    private boolean electronicGauge ;


}