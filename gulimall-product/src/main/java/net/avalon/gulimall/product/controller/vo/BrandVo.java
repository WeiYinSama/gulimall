package net.avalon.gulimall.product.controller.vo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * @Author: Weiyin
 * @Create: 2023/3/8 - 23:20
 */
@Data
public class BrandVo {

    private Long brandId;

    @NotBlank(message = "品牌名不能为空")
    private String name;
    private String logo;
    private Byte showStatus;

    @Pattern(regexp = "[a-zA-Z]",message = "必须是单个字母")
    private String firstLetter;
    private Integer sort;
    private String descript;
}
