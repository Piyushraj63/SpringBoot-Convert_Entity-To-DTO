package com.crud.webDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLocationDto {

	private long userId;
	private String email;
	private String place;
	private double longitude;
    private double latitude;

}
