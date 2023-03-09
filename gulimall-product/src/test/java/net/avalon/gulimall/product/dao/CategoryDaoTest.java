package net.avalon.gulimall.product.dao;

import lombok.extern.slf4j.Slf4j;
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
    void listWithTree() {
        List<Category> list = dao.listWithTree();
        list.forEach(System.out::println);
    }

    @Test
    void findPathById() {
        List<Long> path = dao.findPathById(519L);
        System.out.println(path);

    }
}