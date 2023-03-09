package net.avalon.gulimall.product.controller.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: Weiyin
 * @Create: 2023/3/9 - 21:17
 */
@Data
public class CategorySortVo {

    @NotNull(message = "分类Id不能为null")
    private Long catId;
    private Integer catLevel;
    private Long parentCid;
    private Integer sort;
}
