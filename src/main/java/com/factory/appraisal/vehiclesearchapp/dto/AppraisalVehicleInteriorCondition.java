package com.factory.appraisal.vehiclesearchapp.dto;

//Kalyan
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalVehicleInteriorCondition  {



    @NotNull(message = "Clean Frontline Ready shouldn't be empty")
    private boolean cleanFrontlineReady;
    @NotNull(message = "Good Minor Repairs Needed shouldn't be empty")
    private boolean goodMinorRepairsNeeded;
    @NotNull(message = "SmokersCar shouldn't be empty")
    private boolean smokersCar;
    @NotNull(message = "Odd Smelling shouldn't be empty")
    private boolean oddSmelling;
    @NotNull(message = "Very Dirty shouldn't be empty")
    private boolean veryDirty;
    @NotNull(message = "Strong Pet Smell shouldn't be empty")
    private boolean strongPetSmell;
    @NotNull(message = "Drivers Seat Wear shouldn't be empty")
    private boolean driversSeatWear;
    @NotNull(message = "Headlinear Need Replacement shouldn't be empty")
    private boolean headlinearNeedReplacement;
    @NotNull(message = "Driver Seat Ripped shouldn't be empty")
    private boolean driverSeatRipped;

    @NotNull(message = "Dash CrackedMinor shouldn't be empty")
    private boolean dashCrackedMinor;
    @NotNull(message = "Dash Cracked BrokenMajor shouldn't be empty")
    private boolean dashCrackedBrokenMajor;
    @NotNull(message = "Passenger SeatRipped shouldn't be empty")
    private boolean passengerSeatRipped;
    @NotNull(message = "Carpet Badly Worn shouldn't be empty")
    private boolean carpetBadlyWorn;
    @NotNull(message = "Interior Trim Broken Missing shouldn't be empty")
    private boolean interiorTrimBrokenMissing;
    @NotNull(message = "Poor Needs Repair shouldn't be empty")
    private boolean poorNeedsRepair;



}