package com.yangya.common.utils;

import lombok.Data;

@Data
public class PageParam {

    private Integer limit;
    private Integer page;
    /**检索关键字*/
    private String key;
    /**排序字段*/
    private String sidx;
    /**'asc/desc' 排序方式*/
    private String order;
}
