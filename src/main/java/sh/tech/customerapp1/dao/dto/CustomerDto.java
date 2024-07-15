package sh.tech.customerapp1.dao.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerDto {
    @NotNull(message = "name can't be null")
    @NotBlank(message = "name can't be empty")
    String name;
    @NotNull(message = "surname can't be null")
    @NotBlank(message = "surname can't be empty")
    String lastname;
    @NotNull(message = "email can't be null")
    @NotBlank(message = "email can't be empty")
    String email;
    @NotNull(message = "country can't be null")
    String country;
}
