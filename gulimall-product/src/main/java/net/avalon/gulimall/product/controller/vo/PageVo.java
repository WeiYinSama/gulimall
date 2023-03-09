package net.avalon.gulimall.product.controller.vo;

import jakarta.validation.constraints.Max;
import lombok.Data;

/**
 * @Author: Weiyin
 * @Create: 2023/3/10 - 2:31
 */
@Data
public class PageVo {

    private Integer page;
    @Max(value =300,message = "每页最大不超过300")
    private Integer pageSize;
    private String sortField;
    private String sortMode;
    private String key;
}
