package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("EXPERIMENT_COMPLETION_PROGRESS") // 映射到表 EXPERIMENT_COMPLETION_PROGRESS
public class ExperimentCompletionProgress {

    @TableId("ID") // 映射到列 ID
    private Integer id;

    @TableField("SUBJECT_ID") // 映射到列 SUBJECT_ID
    private Integer subjectId;

    @TableField("INDICATOR_NAME") // 映射到列 INDICATOR_NAME
    private String indicatorName;

    @TableField("RULE") // 映射到列 RULE
    private String rule;

    @TableField("DATA_SOURCE") // 映射到列 DATA_SOURCE
    private String dataSource;

    @TableField("LATEST_DATA") // 映射到列 LATEST_DATA
    private String latestData;

    @TableField("STATUS") // 映射到列 STATUS
    private String status;

    // 这里没有关联其他实体，所以不需要类似的处理
}
