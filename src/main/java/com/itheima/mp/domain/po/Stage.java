package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@TableName("STAGE") // 映射到表 STAGE
public class Stage {

    @TableId("ID") // 映射到列 ID
    private Integer id;

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

    @TableField("STATUS")
    private String status;

    @TableField("OPERATION")
    private String operation;

    // 关联的试验科目列表
    @TableField(exist = false)
    private List<ExpSubject> subjects;

    public List<ExpSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<ExpSubject> subjects) {
        this.subjects = subjects;
    }
}