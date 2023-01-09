package com.kaiyu.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dorm implements Serializable {

    private Integer id;
    private String name;
    private Integer buildingId;
    private Integer maxNum;
    private String remark;
    private Building building;

    private static final long serialVersionUID = 1L;
}
