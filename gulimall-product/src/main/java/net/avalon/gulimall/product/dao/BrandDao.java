package net.avalon.gulimall.product.dao;

import net.avalon.core.util.AvalonException;
import net.avalon.core.util.AvalonStatus;
import net.avalon.gulimall.product.mapper.generator.BrandPoMapper;
import net.avalon.gulimall.product.mapper.generator.po.BrandPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/8 - 4:35
 */
@Repository
public class BrandDao {

    @Autowired
    private BrandPoMapper mapper;


    //TODO CRUD

    /**
     * 品牌新增
     *
     * @param po
     * @return
     */
    public BrandPo createBrand(BrandPo po) throws AvalonException {

        try {
            int insert = mapper.insert(po);
        } catch (DataAccessException e) {
            throw new AvalonException(AvalonStatus.INTERNAL_SERVER_ERR, "新增品牌失败");
        }
        return po;
    }

    /**
     * 修改品牌
     *
     * @param po
     */
    public void updateBrand(BrandPo po) throws AvalonException {

        try {
            int i = mapper.updateByPrimaryKeySelective(po);
            if (i == 0) {
                throw new AvalonException(AvalonStatus.RESOURCE_ID_NOTEXIST, "品牌id不存在");
            }
        } catch (DataAccessException e) {
            throw new AvalonException(AvalonStatus.INTERNAL_SERVER_ERR, "更新商品失败");
        }

    }

    /**
     * 批量删除
     *
     * @param ids
     * @throws AvalonException
     */
    public void deleteByIds(List<Long> ids) throws AvalonException {
        byte b = 0;
        ids.forEach(e -> {
            BrandPo po = new BrandPo();
            po.setBrandId(e);
            po.setShowStatus(b);
            try {
                mapper.updateByPrimaryKeySelective(po);
            } catch (DataAccessException exception) {
                throw new AvalonException(AvalonStatus.RESOURCE_ID_NOTEXIST, "品牌Id不存在");
            }

        });
    }


}
