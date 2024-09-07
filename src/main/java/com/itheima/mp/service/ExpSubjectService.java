package com.itheima.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.mp.domain.po.ExpSubject;

import java.util.List;

public interface ExpSubjectService extends IService<ExpSubject> {
    /**
     * 根据 stageId 和 planId 查询 ExpSubject 列表
     *
     * @param stageId 阶段ID
     * @param planId  试验鉴定方案ID
     * @return ExpSubject 列表
     */
    List<ExpSubject> getExpSubjectsByStageIdAndPlanId(Integer stageId, Integer planId);

    /**
     * 根据 stageId 查询 ExpSubject 列表
     *
     * @param stageId 阶段ID
     * @return ExpSubject 列表
     */
    List<ExpSubject> getExpSubjectsByStageId(Integer stageId);
}
