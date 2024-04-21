package com.accenture.Assignment.Model;

import jakarta.validation.constraints.NotBlank;

public class User {
	@NotBlank
	private String name;
	@NotBlank
	private int age;
}
