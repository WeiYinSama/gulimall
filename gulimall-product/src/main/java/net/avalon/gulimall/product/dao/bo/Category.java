package net.avalon.gulimall.product.dao.bo;

import lombok.Data;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/6 - 23:38
 */
@Data
public class Category {

    private Long catId;
    private String name;
    private Long parentCid;
    private Integer catLevel;
    private Byte showStatus;
    private Integer sort;
    private String icon;
    private String productUnit;
    private Integer productCount;
    private List<Category> children;
}
