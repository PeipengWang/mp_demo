package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


@Data
@TableName("EXP_PLAN") // 映射到表 EXP_PLAN
public class ExpPlan {

    @TableId("ID") // 映射到列 ID
    private Integer id;

    @TableField("NAME") // 映射到列 NAME
    private String name;

    @TableField("EQUIP")
    private String equip;

    @TableField("START_TIME")
    private Timestamp startTime;

    @TableField("END_TIME")
    private Timestamp endTime;

    @TableField("STATUS")
    private String status;

    @TableField("OPERATION")
    private String operation;
    // 关联的阶段列表
    @TableField(exist = false)
    private List<Stage> stages;

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }
}