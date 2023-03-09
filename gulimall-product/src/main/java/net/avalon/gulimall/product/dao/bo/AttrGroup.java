package net.avalon.gulimall.product.dao.bo;

import lombok.Data;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/10 - 2:36
 */
@Data
public class AttrGroup {

    private Long attrGroupId;
    private String attrGroupName;
    private Integer sort;
    private String descript;
    private String icon;
    private Long catelogId;

    private List<Long> catelogPath;
}
