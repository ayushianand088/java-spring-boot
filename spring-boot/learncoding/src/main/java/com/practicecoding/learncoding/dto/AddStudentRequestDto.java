package com.practicecoding.learncoding.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentRequestDto {
    @Size(min=3, max = 30, message = "Name should be of length 3 to 30 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is Required")
    private String email;
}
