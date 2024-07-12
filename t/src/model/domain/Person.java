package model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Person 
{
	private String id;
	private int pw;
	private String address;

}
