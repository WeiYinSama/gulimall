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

    private CategoryPo categoryPo;
    private List<Category> children;
}
