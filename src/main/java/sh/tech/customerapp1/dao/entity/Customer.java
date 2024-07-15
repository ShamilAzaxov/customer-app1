package sh.tech.customerapp1.dao.entity;

import jakarta.persistence.*;
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
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(generator = "seq")
    @SequenceGenerator(name = "seq", allocationSize = 1)
    Long id;
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
