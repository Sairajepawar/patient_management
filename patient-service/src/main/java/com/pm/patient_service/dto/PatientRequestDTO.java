package com.pm.patient_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PatientRequestDTO {
    @NotBlank(message = "name required")
    @Size(max=100,message = "100 character limit")
    private String name;

    @NotBlank(message = "email required")
    @Email(message = "email should be valid")
    private String email;

    @NotBlank(message = "address required")
    private String address;

    @NotBlank(message = "dob is required")
    private String dateOfBirth;

    @NotBlank(message = "registered date required")
    private String registeredDate;
}
