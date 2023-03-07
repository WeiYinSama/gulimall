package net.avalon.gulimall.product.dao;

import lombok.extern.slf4j.Slf4j;
import net.avalon.gulimall.product.controller.vo.CategoryVo;
import net.avalon.gulimall.product.dao.bo.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/7 - 21:56
 */
@SpringBootTest
//@Transactional
@Slf4j
class CategoryDaoTest {

    @Autowired
    private CategoryDao dao;

    @Test
    void deleteByIds() {
        dao.deleteByIds(List.of(1L,2L,3L,4L,5L,6L,7L,8L,9L));
    }

    @Test
    void addCategory() {
        CategoryVo vo = new CategoryVo();
        vo.setName("本子");
        vo.setParentCid(3L);

        Category bo = vo.toBo();
        dao.addCategory(bo);
        log.info(bo.toString());
    }

    @Test
    void updateCategory() {
        CategoryVo vo = new CategoryVo();
        vo.setCatId(1432L);
        vo.setName("本子");

        Category bo = vo.toBo();
        dao.updateCategory(bo);
        log.info(bo.toString());
    }
}