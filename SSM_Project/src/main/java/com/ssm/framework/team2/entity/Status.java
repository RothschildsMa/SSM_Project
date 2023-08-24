package com.ssm.framework.team2.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Status implements Serializable{

	private Integer statusId;
	private String statusName;

}