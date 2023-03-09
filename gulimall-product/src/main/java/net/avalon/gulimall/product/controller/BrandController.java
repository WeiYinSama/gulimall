package net.avalon.gulimall.product.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import net.avalon.core.util.ResponseUtil;
import net.avalon.gulimall.product.controller.vo.BrandVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Weiyin
 * @Create: 2023/3/8 - 23:22
 */
@RestController
@Slf4j
public class BrandController {


    @PostMapping("/brand/add")
    public Object createBrand(@Valid @RequestBody BrandVo vo) {
        log.info("新增商品：{}", vo);
        return ResponseUtil.created(vo);
    }
}
