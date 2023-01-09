package com.kaiyu.model;

import lombok.Data;

import java.util.List;

@Data
public class ResponsePage {

    private List<?> data;
    private Long total;
}
