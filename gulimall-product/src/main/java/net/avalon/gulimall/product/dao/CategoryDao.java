package net.avalon.gulimall.product.dao;

import lombok.extern.slf4j.Slf4j;
import net.avalon.core.util.AvalonException;
import net.avalon.core.util.AvalonStatus;
import net.avalon.gulimall.product.dao.bo.Category;
import net.avalon.gulimall.product.mapper.generator.CategoryPoMapper;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/6 - 23:22
 */
@Repository
@Slf4j
public class CategoryDao {

    @Autowired
    private CategoryPoMapper categoryPoMapper;


    /**
     * 查出所有分类及其子类
     * <p>
     * 1. 获得所有一级分类
     * 2. toBo
     * 3. setChildren
     * 4. sort
     * 5. collect
     *
     * @return
     */
    public List<Category> listWithTree() {

        List<CategoryPo> list = categoryPoMapper.selectByExample(null);

        return list.stream()
                .filter(e -> e.getParentCid() == 0)
                .map(e -> {
                    Category entity = new Category();
                    entity.setCategoryPo(e);
                    return entity;
                })
                .peek(e -> e.setChildren(getChildren(e, list)))
                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort()))
                .toList();
    }

    private List<Category> getChildren(Category root, List<CategoryPo> all) {
        if (root == null) {
            return null;
        }
        return all.stream()
                .filter(e -> e.getParentCid().equals(root.getCategoryPo().getCatId()))
                .map(e -> {
                    Category entity = new Category();
                    entity.setCategoryPo(e);
                    entity.setChildren(getChildren(entity, all));
                    return entity;
                })
                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort() == null ? 0 : e.getCategoryPo().getSort()))
                .toList();
    }


    /**
     * 批量删除
     *
     * @param ids
     */
    public void deleteByIds(List<Long> ids) throws AvalonException {
        byte b = 0;
        ids.forEach(e -> {
            CategoryPo po = new CategoryPo();
            po.setCatId(e);
            po.setShowStatus(b);
            try {
                categoryPoMapper.updateByPrimaryKeySelective(po);
            } catch (DataAccessException exception) {
                throw new AvalonException(AvalonStatus.RESOURCE_ID_NOTEXIST, "分类Id不存在");
            }

        });
    }

    /**
     * 添加分类
     *
     * @param entity
     */
    public Category addCategory(Category entity) {
        int insert = categoryPoMapper.insert(entity.getCategoryPo());
        return entity;
    }

    /**
     * 修改分类
     *
     * @param entity
     */
    public void updateCategory(Category entity) throws AvalonException {

        try {
            categoryPoMapper.updateByPrimaryKeySelective(entity.getCategoryPo());
        } catch (DataAccessException exception) {
            throw new AvalonException(AvalonStatus.RESOURCE_ID_NOTEXIST, "分类Id不存在");
        }

    }
}
