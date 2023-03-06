package net.avalon.gulimall.product.controller;

import net.avalon.core.util.ResponseBody;
import net.avalon.core.util.ResponseUtil;
import net.avalon.gulimall.product.dao.CategoryDao;
import net.avalon.gulimall.product.dao.bo.CategoryEntity;
import net.avalon.gulimall.product.mapper.generator.CategoryPoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/7 - 1:56
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryPoMapper mapper;

    @Autowired
    private CategoryDao dao;


    @GetMapping("/list/tree")
    public ResponseBody listTree(){
        List<CategoryEntity> ret = dao.listWithTree();
        return ResponseUtil.ok(ret);
    }
}
