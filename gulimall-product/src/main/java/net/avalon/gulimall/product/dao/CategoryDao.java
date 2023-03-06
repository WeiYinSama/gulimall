package net.avalon.gulimall.product.dao;

import net.avalon.gulimall.product.dao.bo.CategoryEntity;
import net.avalon.gulimall.product.mapper.generator.CategoryPoMapper;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/6 - 23:22
 */
@Repository
public class CategoryDao {

    @Autowired
    private CategoryPoMapper categoryPoMapper;


    /**
     * 查出所有分类及其子类
     *
     * 1. 获得所有一级分类
     * 2. toBo
     * 3. setChildren
     * 4. sort
     * 5. collect
     * @return
     */
    public List<CategoryEntity> listWithTree() {

        List<CategoryPo> list = categoryPoMapper.selectByExample(null);

        return list.stream()
                .filter(e -> e.getParentCid() == 0)
                .map(e -> {
                    CategoryEntity entity = new CategoryEntity();
                    entity.setCategoryPo(e);
                    return entity;
                })
                .peek(e -> e.setChildren(getChildren(e, list)))
                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort()))
                .toList();
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryPo> all) {
        if (root == null) {
            return null;
        }
        return all.stream()
                .filter(e -> e.getParentCid().equals(root.getCategoryPo().getCatId()))
                .map(e -> {
                    CategoryEntity entity = new CategoryEntity();
                    entity.setCategoryPo(e);
                    entity.setChildren(getChildren(entity, all));
                    return entity;
                })
                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort() == null ? 0 : e.getCategoryPo().getSort()))
                .toList();
    }
}
