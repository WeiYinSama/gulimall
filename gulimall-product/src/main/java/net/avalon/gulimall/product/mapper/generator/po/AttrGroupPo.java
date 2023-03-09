package net.avalon.gulimall.product.mapper.generator.po;

import lombok.Data;

@Data
public class AttrGroupPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_group.attr_group_id
     *
     * @mbg.generated
     */
    private Long attrGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_group.attr_group_name
     *
     * @mbg.generated
     */
    private String attrGroupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_group.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_group.descript
     *
     * @mbg.generated
     */
    private String descript;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_group.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_attr_group.catelog_id
     *
     * @mbg.generated
     */
    private Long catelogId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_group.attr_group_id
     *
     * @return the value of pms_attr_group.attr_group_id
     *
     * @mbg.generated
     */
    public Long getAttrGroupId() {
        return attrGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_group.attr_group_id
     *
     * @param attrGroupId the value for pms_attr_group.attr_group_id
     *
     * @mbg.generated
     */
    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_group.attr_group_name
     *
     * @return the value of pms_attr_group.attr_group_name
     *
     * @mbg.generated
     */
    public String getAttrGroupName() {
        return attrGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_group.attr_group_name
     *
     * @param attrGroupName the value for pms_attr_group.attr_group_name
     *
     * @mbg.generated
     */
    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName == null ? null : attrGroupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_group.sort
     *
     * @return the value of pms_attr_group.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_group.sort
     *
     * @param sort the value for pms_attr_group.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_group.descript
     *
     * @return the value of pms_attr_group.descript
     *
     * @mbg.generated
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_group.descript
     *
     * @param descript the value for pms_attr_group.descript
     *
     * @mbg.generated
     */
    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_group.icon
     *
     * @return the value of pms_attr_group.icon
     *
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_group.icon
     *
     * @param icon the value for pms_attr_group.icon
     *
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_attr_group.catelog_id
     *
     * @return the value of pms_attr_group.catelog_id
     *
     * @mbg.generated
     */
    public Long getCatelogId() {
        return catelogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_attr_group.catelog_id
     *
     * @param catelogId the value for pms_attr_group.catelog_id
     *
     * @mbg.generated
     */
    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }
}