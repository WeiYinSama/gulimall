package net.avalon.gulimall.product.mapper.generator.po;

import lombok.Data;

@Data
public class CategoryPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.cat_id
     *
     * @mbg.generated
     */
    private Long catId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.parent_cid
     *
     * @mbg.generated
     */
    private Long parentCid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.cat_level
     *
     * @mbg.generated
     */
    private Integer catLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.show_status
     *
     * @mbg.generated
     */
    private Byte showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.product_unit
     *
     * @mbg.generated
     */
    private String productUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_category.product_count
     *
     * @mbg.generated
     */
    private Integer productCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.cat_id
     *
     * @return the value of pms_category.cat_id
     *
     * @mbg.generated
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.cat_id
     *
     * @param catId the value for pms_category.cat_id
     *
     * @mbg.generated
     */
    public void setCatId(Long catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.name
     *
     * @return the value of pms_category.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.name
     *
     * @param name the value for pms_category.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.parent_cid
     *
     * @return the value of pms_category.parent_cid
     *
     * @mbg.generated
     */
    public Long getParentCid() {
        return parentCid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.parent_cid
     *
     * @param parentCid the value for pms_category.parent_cid
     *
     * @mbg.generated
     */
    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.cat_level
     *
     * @return the value of pms_category.cat_level
     *
     * @mbg.generated
     */
    public Integer getCatLevel() {
        return catLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.cat_level
     *
     * @param catLevel the value for pms_category.cat_level
     *
     * @mbg.generated
     */
    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.show_status
     *
     * @return the value of pms_category.show_status
     *
     * @mbg.generated
     */
    public Byte getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.show_status
     *
     * @param showStatus the value for pms_category.show_status
     *
     * @mbg.generated
     */
    public void setShowStatus(Byte showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.sort
     *
     * @return the value of pms_category.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.sort
     *
     * @param sort the value for pms_category.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.icon
     *
     * @return the value of pms_category.icon
     *
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.icon
     *
     * @param icon the value for pms_category.icon
     *
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.product_unit
     *
     * @return the value of pms_category.product_unit
     *
     * @mbg.generated
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.product_unit
     *
     * @param productUnit the value for pms_category.product_unit
     *
     * @mbg.generated
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_category.product_count
     *
     * @return the value of pms_category.product_count
     *
     * @mbg.generated
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_category.product_count
     *
     * @param productCount the value for pms_category.product_count
     *
     * @mbg.generated
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}