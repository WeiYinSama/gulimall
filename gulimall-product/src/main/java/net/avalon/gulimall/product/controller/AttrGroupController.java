package net.avalon.gulimall.product.controller;

import jakarta.validation.Valid;
import net.avalon.core.util.ResponseBody;
import net.avalon.core.util.ResponseUtil;
import net.avalon.gulimall.product.controller.vo.PageVo;
import net.avalon.gulimall.product.dao.AttrGroupDao;
import net.avalon.gulimall.product.dao.bo.AttrGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/10 - 2:24
 */
@RestController
public class AttrGroupController {

    @Autowired
    private AttrGroupDao dao;


    @GetMapping("/product/attrgroup/list/{catelogId}")
    public ResponseBody groupInfo(@Valid @RequestBody PageVo vo, @PathVariable("catelogId") Long cId) {

        List<AttrGroup> ret = dao.findByCategoryId(cId, vo);
        return ResponseUtil.ok(ret);
    }

    @GetMapping("/product/attrgroup/info/{attrGroupId}")
    public ResponseBody groupInfo(@PathVariable("attrGroupId") Long attrGroupId) {

        AttrGroup ret = dao.findByAttrGroupId(attrGroupId);
        return ResponseUtil.ok(ret);
    }
}
