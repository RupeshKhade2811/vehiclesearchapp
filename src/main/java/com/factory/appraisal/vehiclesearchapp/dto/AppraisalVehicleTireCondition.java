package com.factory.appraisal.vehiclesearchapp.dto;
//@Author:Yogesh
import com.factory.appraisal.vehiclesearchapp.Author;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Author("Yogesh Kumar V")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalVehicleTireCondition  {

    @NotNull
    private boolean tireWidth;
    @NotNull
    private boolean fourMatch;
    @NotNull
    private boolean mismatched;
    @NotNull
    private boolean excellentTread;
    @NotNull
    private boolean goodTread;
    @NotNull
    private boolean poorTread;
    @NotNull
    private boolean needsReplacement;
    @NotNull
    private boolean frontUnevenWearPattern;
    @NotNull
    private boolean frontTiresBad;
    @NotNull
    private boolean rearTiresBad;
    @NotNull
    private boolean noSpareTire;
    @NotNull
    private boolean spareTireOnVehicle;

}