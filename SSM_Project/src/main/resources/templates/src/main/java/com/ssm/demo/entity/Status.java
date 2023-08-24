package com.ssm.demo.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Status implements Serializable{

	private String statusId;
	private String statusName;

}
