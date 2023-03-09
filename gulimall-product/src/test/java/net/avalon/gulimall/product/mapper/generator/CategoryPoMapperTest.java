package net.avalon.gulimall.product.mapper.generator;

import lombok.extern.slf4j.Slf4j;
import net.avalon.gulimall.product.dao.bo.Category;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPoExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        List<Category> ret = new ArrayList<>();

        CategoryPoExample example = new CategoryPoExample();
        example.createCriteria()
                .andCatIdIn(null);


    }


//    @Test
//    public void test2() {
//
//        List<Category> ret1 = new ArrayList<>();
//
//        //找到所有分类
//        List<CategoryPo> list = mapper.selectByExample(null);
//
////        List<Category> all = list.stream().map(e -> {
////            Category entity = new Category();
////            entity.setCategoryPo(e);
////            return entity;
////        }).toList();
//        //1. 获取所有一级分类
//        //2. to Entity
//        //3. getChildren
//        //4. sort
//        //5. collect
//
//        List<Category> ret = list.stream()
//                .filter(e -> e.getParentCid() == 0)
//                .map(e -> {
//                    Category entity = new Category();
//                    entity.setCategoryPo(e);
//                    return entity;
//                })
//                .peek(e -> {
//                    e.setChildren(getChildren(e, list));
//                })
//                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort()))
//                .toList();
//    }

//    private List<Category> getChildren(Category root, List<CategoryPo> all) {
//        if(root == null) return null;
//        List<Category> ret = all.stream()
//                .filter(e -> e.getParentCid() == root.getCategoryPo().getCatId())
//                .map(e -> {
//                    Category entity = new Category();
//                    entity.setCategoryPo(e);
//                    entity.setChildren(getChildren(entity, all));
//                    return entity;
//                })
//                .sorted(Comparator.comparingInt(e -> e.getCategoryPo().getSort()))
//                .toList();
//        return ret;
//    }
}