package com.ust.model;

import lombok.Data;

//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
@Data  //Generate setter,getters,to string,required arg constructor,has code,equal to
public class Product {

	private int pid;
	private String pname;
	private float sal;
}
