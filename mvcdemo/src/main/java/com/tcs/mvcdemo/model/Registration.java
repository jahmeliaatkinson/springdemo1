package com.tcs.mvcdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Registration {

	
	
	

	@Id
	@Column(length =20 )
	
	private String firstName;
	
	private String lastName;
	@Id
	@Size(max=20, min =3 ,message = "user name is not valid")
	private String userName;
	@Size(max=20, min =3 ,message = "password is not valid")
	private String password;
	private String Address;
	@Size(max=20, min =3 ,message = "Phone number is not valid")
	private String ContactNo;

}


