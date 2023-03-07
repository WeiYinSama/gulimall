package net.avalon.gulimall.product.dao.bo;

import lombok.Data;

/**
 * @Author: Weiyin
 * @Create: 2023/3/8 - 4:54
 */
@Data
public class Brand {
    private Long brandId;
    private String name;
    private String logo;
    private Byte showStatus;
    private String firstLetter;
    private Integer sort;
    private String descript;
}
