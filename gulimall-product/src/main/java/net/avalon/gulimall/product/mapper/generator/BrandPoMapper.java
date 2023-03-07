package net.avalon.gulimall.product.mapper.generator;

import java.util.List;
import net.avalon.gulimall.product.mapper.generator.po.BrandPo;
import net.avalon.gulimall.product.mapper.generator.po.BrandPoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BrandPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    long countByExample(BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int deleteByExample(BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int insert(BrandPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int insertSelective(BrandPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    List<BrandPo> selectByExampleWithBLOBs(BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    List<BrandPo> selectByExample(BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    BrandPo selectByPrimaryKey(Long brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") BrandPo row, @Param("example") BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("row") BrandPo row, @Param("example") BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") BrandPo row, @Param("example") BrandPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BrandPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(BrandPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BrandPo row);
}