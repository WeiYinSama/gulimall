package net.avalon.gulimall.product.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import net.avalon.core.util.ResponseBody;
import net.avalon.core.util.ResponseUtil;
import net.avalon.gulimall.product.controller.vo.CategorySortVo;
import net.avalon.gulimall.product.dao.CategoryDao;
import net.avalon.gulimall.product.dao.bo.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/7 - 1:56
 */
@RestController
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryDao dao;


    @GetMapping("/product/category/list/tree")
    public ResponseBody listTree(){
        List<Category> ret = dao.listWithTree();
        return ResponseUtil.ok(ret);
    }

    @PostMapping("/product/category/update/sort")
    public ResponseBody updateSort(@Valid @RequestBody List<CategorySortVo> list){

        List<Category> categoryList = list.stream()
                .map(vo -> {
                    Category bo = new Category();
                    BeanUtils.copyProperties(vo, bo);
                    return bo;
                }).toList();
        dao.updateCategorySort(categoryList);

        return ResponseUtil.ok();
    }
}
