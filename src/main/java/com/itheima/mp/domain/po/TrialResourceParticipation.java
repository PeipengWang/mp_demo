package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("TRIAL_RESOURCE_PARTICIPATION") // 映射到表 TRIAL_RESOURCE_PARTICIPATION
public class TrialResourceParticipation {

    @TableId("ID") // 映射到列 ID
    private Integer id;

    @TableField("SUBJECT_ID") // 映射到列 SUBJECT_ID
    private Integer subjectId;

    @TableField("RESOURCE_NAME") // 映射到列 RESOURCE_NAME
    private String resourceName;

    @TableField("RESOURCE_TYPE") // 映射到列 RESOURCE_TYPE
    private String resourceType;

    @TableField("START_TIME") // 映射到列 START_TIME
    private LocalDateTime startTime;

    @TableField("END_TIME") // 映射到列 END_TIME
    private LocalDateTime endTime;

    @TableField("OPERATION") // 映射到列 OPERATION
    private String operation;

    // 这里没有关联其他实体，所以不需要类似的处理
}
