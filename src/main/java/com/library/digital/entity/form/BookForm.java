package com.library.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookForm {
	
	@NotBlank(message = "Fill the field correctly.")
	private String title;
	
	@NotNull(message = "Fill the field correctly.")
	@Positive(message = "The Id must be positive.")
	private Long authorId;
	
	@NotNull(message = "Fill the field correctly.")
	private int pagesNumber;
	
	@NotBlank(message = "Fill the field correctly.")
	private String publisher;
	
	@NotNull(message = "Fill the field correctly.")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate publicationDate;
	
	@Size(min = 10, max = 500, message = "'${validatedValue}' must be between {min} and {max} characters.")
	private String description;

}
