package net.avalon.gulimall.product.dao;

import com.alibaba.nacos.shaded.com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import net.avalon.core.util.AvalonException;
import net.avalon.core.util.AvalonStatus;
import net.avalon.gulimall.product.dao.bo.Category;
import net.avalon.gulimall.product.mapper.generator.CategoryPoMapper;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
     *
     * @return
     */
    public List<Category> listWithTree() throws AvalonException {

        List<CategoryPo> pos = null;
        try {
            //1. 查询所有分类
            pos = categoryPoMapper.selectByExample(null);
        } catch (DataAccessException e) {
            throw new AvalonException(AvalonStatus.INTERNAL_SERVER_ERR, "数据库访问错误");
        }
        //2. toBo
        List<Category> bos = pos.stream()
                .map(po -> {
                    Category category = new Category();
                    BeanUtils.copyProperties(po, category);
                    return category;
                }).toList();

        return bos.stream()
                //3. 拿到所有一级分类
                .filter(e -> e.getParentCid() == 0)
                //4. 设置子分类
                .peek(e -> e.setChildren(getChildren(e, bos)))
                //5. 根据Sort字段排序
                .sorted(Comparator.comparingInt(c -> (c.getSort() == null ? 0 : c.getSort())))
                .toList();
    }

    /**
     * 递归拿到子分类
     *
     * @param cur
     * @param all
     * @return
     */
    private List<Category> getChildren(Category cur, List<Category> all) {

        return all.stream()
                // 拿到cur的所有子分类
                .filter(e -> e.getParentCid().equals(cur.getCatId()))
                .peek(e -> e.setChildren(getChildren(e, all)))
                .sorted(Comparator.comparingInt(c -> (c.getSort() == null ? 0 : c.getSort())))
                .toList();
    }

    /**
     * 修改分类父子关系以及顺序
     *
     * @param list
     * @throws AvalonException
     */
    public void updateCategorySort(List<Category> list) throws AvalonException {
        list.forEach(c -> {
            CategoryPo po = new CategoryPo();
            BeanUtils.copyProperties(c, po);
            try {
                int i = categoryPoMapper.updateByPrimaryKeySelective(po);
                if (i == 0) {
                    throw new AvalonException(AvalonStatus.RESOURCE_ID_NOTEXIST, "分类Id不存在");
                }
            } catch (DataAccessException e) {
                throw new AvalonException(AvalonStatus.INTERNAL_SERVER_ERR, "数据库访问错误");
            }
        });
    }


    /**
     * 拿到分类完整路径
     *
     * @param id
     * @return
     */
    public List<Long> findPathById(Long id) {

        List<Long> path = new ArrayList<>();
        recursion(id, path);

        return Lists.reverse(path);
    }

    private void recursion(Long id, List<Long> path) {

        if (id != 0) {
            path.add(id);

            CategoryPo po = categoryPoMapper.selectByPrimaryKey(id);
            Long pid = po.getParentCid();

            recursion(pid, path);
        }
    }
}
