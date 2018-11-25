package com.ptteng.water.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Taimur
 * @since 2018-11-25
 */
public class Element implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @TableField("create_at")
    private Long createAt;

    /**
     * 创建人
     */
    @TableField("create_by")
    private Long createBy;

    /**
     * 更新时间
     */
    @TableField("update_at")
    private Long updateAt;

    /**
     * 更新人
     */
    @TableField("update_by")
    private Long updateBy;

    /**
     * 指标名称
     */
    @TableField("name")
    private String name;

    /**
     * 期望分数
     */
    @TableField("expect_grade")
    private String expectGrade;

    /**
     * 期望完成度
     */
    @TableField("expect")
    private String expect;

    /**
     * 评分标准
     */
    @TableField("standard")
    private String standard;

    /**
     * 解释
     */
    @TableField("explain")
    private String explain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getExpectGrade() {
        return expectGrade;
    }

    public void setExpectGrade(String expectGrade) {
        this.expectGrade = expectGrade;
    }
    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return "Element{" +
        "id=" + id +
        ", createAt=" + createAt +
        ", createBy=" + createBy +
        ", updateAt=" + updateAt +
        ", updateBy=" + updateBy +
        ", name=" + name +
        ", expectGrade=" + expectGrade +
        ", expect=" + expect +
        ", standard=" + standard +
        ", explain=" + explain +
        "}";
    }
}
