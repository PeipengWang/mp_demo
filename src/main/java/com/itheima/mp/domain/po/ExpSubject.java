package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("EXP_SUBJECT") // 映射到表 EXP_SUBJECT
public class ExpSubject {

    @TableId(value = "ID", type = IdType.AUTO) // 映射到列 ID
    private Integer id;

    @TableField("STAGE_ID")
    private Integer stageId;

    @TableField("PLAN_ID")
    private Integer planId;

    @TableField("NAME")
    private String name;

    @TableField("EQUIP")
    private String equip;

    @TableField("START_TIME")
    private Timestamp startTime;

    @TableField("END_TIME")
    private Timestamp endTime;

    @TableField("EVAL_METHOD")
    private String evalMethod;

    @TableField("TESTED_EVAL")
    private String testedEval;

    @TableField("ACCOMPANIED_EVAL")
    private String accompaniedEval;

    @TableField("STATUS")
    private String status;

    @TableField("OPERATION")
    private String operation;
}