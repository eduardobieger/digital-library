package com.library.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorForm {

	@NotBlank(message = "Fill the field correctly.")
	@Size(min = 2, max = 100, message = "'${validatedValue}' must be between {min} and {max} characters.")
	private String name;
	
	@NotNull(message = "Fill the field correctly.")
	@Past(message = "'${validatedValue}' is an invalid date.")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;
	
}
