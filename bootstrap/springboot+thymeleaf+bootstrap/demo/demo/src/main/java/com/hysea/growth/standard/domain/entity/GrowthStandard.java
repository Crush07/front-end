package com.hysea.growth.standard.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class GrowthStandard {

    @TableId(value = "growth_standard_id", type = IdType.AUTO)
    private Long growthStandardId;

    @TableField("growth_standard_type")
    private Integer growthStandardType;

    @TableField("moon_age")
    private Integer moonAge;

    @TableField("level")
    private String level;

    @TableField("standard_value")
    private Double standardValue;

}
