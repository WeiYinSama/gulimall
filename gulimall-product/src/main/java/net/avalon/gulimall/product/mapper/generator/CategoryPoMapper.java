package net.avalon.gulimall.product.mapper.generator;

import java.util.List;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPo;
import net.avalon.gulimall.product.mapper.generator.po.CategoryPoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CategoryPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    long countByExample(CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int deleteByExample(CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int insert(CategoryPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int insertSelective(CategoryPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    List<CategoryPo> selectByExample(CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    CategoryPo selectByPrimaryKey(Long catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") CategoryPo row, @Param("example") CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") CategoryPo row, @Param("example") CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CategoryPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CategoryPo row);
}