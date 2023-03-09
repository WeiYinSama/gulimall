package net.avalon.gulimall.product.dao;

import com.github.pagehelper.PageHelper;
import net.avalon.core.util.AvalonException;
import net.avalon.core.util.AvalonStatus;
import net.avalon.gulimall.product.controller.vo.PageVo;
import net.avalon.gulimall.product.dao.bo.AttrGroup;
import net.avalon.gulimall.product.mapper.generator.AttrGroupPoMapper;
import net.avalon.gulimall.product.mapper.generator.po.AttrGroupPo;

import net.avalon.gulimall.product.mapper.generator.po.AttrGroupPoExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Weiyin
 * @Create: 2023/3/9 - 6:24
 */
@Repository
public class AttrGroupDao {

    @Autowired
    private AttrGroupPoMapper mapper;

    @Autowired
    private CategoryDao categoryDao;


    public List<AttrGroup> findByCategoryId(Long cId, PageVo vo) throws AvalonException {

        AttrGroupPoExample example = new AttrGroupPoExample();
        String key = vo.getKey();
        if (key != null) {
            example.createCriteria()
                    .andCatelogIdEqualTo(cId)
                    .andAttrGroupNameLike("%".concat(key).concat("%"));
        } else {
            example.createCriteria()
                    .andCatelogIdEqualTo(cId);
        }
        example.setOrderByClause(vo.getSortField().concat(" ").concat(vo.getSortMode()));

        List<AttrGroupPo> pos = null;
        try {
            PageHelper.startPage(vo.getPage(), vo.getPageSize(), false);
            pos = mapper.selectByExample(example);
        } catch (DataAccessException e) {
            throw new AvalonException(AvalonStatus.INTERNAL_SERVER_ERR, "数据库访问错误");
        }
        return pos.stream()
                .map(e -> {
                    AttrGroup bo = new AttrGroup();
                    BeanUtils.copyProperties(e, bo);
                    bo.setCatelogPath(categoryDao.findPathById(e.getCatelogId()));
                    return bo;
                })
                .toList();
    }

    public AttrGroup findByAttrGroupId(Long attrGroupId) throws AvalonException{

        AttrGroup bo = new AttrGroup();

        AttrGroupPo po = null;
        try {
            po = mapper.selectByPrimaryKey(attrGroupId);
            if(po ==null){
                throw new AvalonException(AvalonStatus.RESOURCE_ID_NOTEXIST,"属性分组Id不存在");
            }
            BeanUtils.copyProperties(po,bo);
            bo.setCatelogPath(categoryDao.findPathById(po.getCatelogId()));
        } catch (DataAccessException e) {
            throw new AvalonException(AvalonStatus.INTERNAL_SERVER_ERR, "数据库访问错误");
        }
        return bo;
    }
}
