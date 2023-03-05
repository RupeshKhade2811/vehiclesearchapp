package com.factory.appraisal.vehiclesearchapp.dto;

import com.factory.appraisal.vehiclesearchapp.Author;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Author("Yogesh Kumar V")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DealerRegistration {
    private  long dealerId;
    @Size(max = 30)
    @NotNull
    private String name;
    @Size(max = 15)
    @NotNull
    private String clientFirstName;
    @Size(max = 15)
    @NotNull
    private String clientLastName;
    @Size(max = 20)
    @NotNull
    private String ApartmentNumber;
    @Size(max = 10)
    @NotNull
    private String city;
    @Size(max = 50)
    @NotNull
    private String email;
    @Size(max = 20)
    @NotNull
    private String password;
    @Pattern(regexp="^\\+1\\s\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}$",
            message = "phone number should be in the format -" +
            "+1-XXX-XXX-XXXX"+" +1XXXXXXXXXX"
    )
    @NotNull
    private String phoneNumber;
    @Size(max = 17)
    @NotNull
    private String profilePicture;
    @Size(max = 10)
    @NotNull
    private String state;
    @Size(max = 50)
    @NotNull
    private String streetAddress;
    @Size(max = 5)
    @NotNull
    private String zipCode;
    @Size(max = 10)
    @NotNull
    private String latitude;
    @Size(max = 10)
    @NotNull
    private String longitude;
    @Size(max = 17)
    @NotNull
    private String taxCertificate;
    @Size(max = 30)
    @NotNull
    private String dealershipUserNames;
    @Size(max = 50)
    @NotNull
    private String dealershipAddress;
    @Size(max = 50)
    @NotNull
    private String dealershipStreet;
    @Size(max = 10)
    @NotNull
    private String dealershipCity;
    @Size(max = 5)
    @NotNull
    private String dealershipZipCode;
    @Pattern(regexp="^\\+1\\s\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}$",
            message = "phone number should be in the format "+
            "+1-XXX-XXX-XXXX"+"+1XXXXXXXXXX"
    )
    @NotNull
    private String dealershipPhoneNumber;
    @Size(max = 17)
    @NotNull
    private String dealershipPicture;
    @Size(max = 17)
    @NotNull
    private String dealershipLicense;
    @Size(max = 30)
    @NotNull
    private String corporationName;

}