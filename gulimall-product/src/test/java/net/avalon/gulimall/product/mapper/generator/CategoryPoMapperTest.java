package net.avalon.gulimall.product.mapper.generator;

import lombok.extern.slf4j.Slf4j;
import net.avalon.gulimall.product.dao.bo.CategoryEntity;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPoExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Weiyin
 * @Create: 2023/3/6 - 23:24
 */
@SpringBootTest
@Slf4j
class CategoryPoMapperTest {

    @Autowired
    private CategoryPoMapper mapper;

    @Test
    public void test() {

        List<CategoryPo> list = mapper.selectByExample(null);
        List<CategoryEntity> ret = new ArrayList<>();

    }


    @Test
    public void test2() {

        List<CategoryEntity> ret1 = new ArrayList<>();

        //找到所有分类
        List<CategoryPo> list = mapper.selectByExample(null);

//        List<CategoryEntity> all = list.stream().map(e -> {
//            CategoryEntity entity = new CategoryEntity();
//            entity.setCategoryPo(e);
//            return entity;
//        }).toList();
        //1. 获取所有一级分类
        //2. to Entity
        //3. getChildren
        //4. sort
        //5. collect

        List<CategoryEntity> ret = list.stream()
                .filter(e -> e.getParentCid() == 0)
                .map(e -> {
                    CategoryEntity entity = new CategoryEntity();
                    entity.setCategoryPo(e);
                    return entity;
                })
                .peek(e -> {
                    e.setChildren(getChildren(e, list));
                })
                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort()))
                .toList();
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryPo> all) {
        if(root == null) return null;
        List<CategoryEntity> ret = all.stream()
                .filter(e -> e.getParentCid() == root.getCategoryPo().getCatId())
                .map(e -> {
                    CategoryEntity entity = new CategoryEntity();
                    entity.setCategoryPo(e);
                    entity.setChildren(getChildren(entity, all));
                    return entity;
                })
                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort()))
                .toList();
        return ret;
    }
}