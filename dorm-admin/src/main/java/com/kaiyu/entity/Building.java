package com.kaiyu.entity;

import lombok.Data;

@Data
public class Building {

    private Integer id;
    private String name;
    private Integer buildingType;
    private String remark;

    private static final long serialVersionUID = 1L;
}
