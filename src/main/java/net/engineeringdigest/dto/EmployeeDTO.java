package net.engineeringdigest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Name of the employee cannot be blank")
    @Size(min = 3,max=10,message = "Number of characters in name should be in the range : [3,10]")
    private String name;

    @NotBlank(message = "Email of the employee cannot be bank")
    @Email(message = "Email should be a valid email")
    private String email;

    @NotNull(message = "Age of the employee cannot be blank")
    @Max(value = 80,message = "Age of Employee cannot be greater than 80")
    @Min(value = 18,message = " Age of Employee cannot be less than 18 and this is it")
    private Integer age;

    @NotBlank(message = "Role of the employee cannot be blank")
    @EmployeeRoleValidation
    private String role;

    @NotNull(message = "Salary of Employee should be not be null")
    @Positive(message = "Salary of the Employee should be positive")
    @Digits(integer = 6,fraction =2,message = "The Salary can be in the form XXXXX.YY")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "DateOfJoining feild in Employee cannot be in the future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    @JsonProperty("isActive")
    private Boolean isActive;

}
