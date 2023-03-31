package com.sms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * @Author mei
 * @create 2023/3/29 16:37
 */
@Data
public class Employee {
    private LocalDate date;
    private String name;
}
