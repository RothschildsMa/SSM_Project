package com.ssm.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ATTMonthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private int month;
    private int workingDays;
    private int attendanceDays;
    private int absenteeismDays;
    private double actualWorkingHours;
    private double overtimeHours;
    private String comments;


}