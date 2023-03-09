package net.avalon.gulimall.product.controller.vo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: Weiyin
 * @Create: 2023/3/7 - 22:55
 */
@Data
public class CategoryVo {

    private Long catId;

    @NotBlank(message = "分类名称不能为空")
    private String name;

    @NotNull(message = "父类Id不能为NULL")
    private Long parentCid;
    private Integer catLevel;
    private Byte showStatus;
    private Integer sort;


    private String icon;
    private String productUnit;


//    public Category toBo(){
//        Category entity = new Category();
//
//        CategoryPo po = new CategoryPo();
//        po.setName(name);
//        po.setParentCid(parentCid);
//        po.setCatLevel(catLevel);
//        po.setShowStatus(showStatus);
//        po.setSort(sort);
//
//        po.setCatId(catId);
//        po.setIcon(icon);
//        po.setProductUnit(productUnit);
//
//        entity.setCategoryPo(po);
//        return entity;
//    }
}
