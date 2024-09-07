package com.itheima.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.mp.domain.po.Stage;

import java.util.List;

public interface StageService extends IService<Stage> {
    /**
     * 根据 planId 查询阶段列表
     *
     * @param planId 试验鉴定方案ID
     * @return 阶段列表
     */
    List<Stage> getStagesByPlanId(Integer planId);
}
