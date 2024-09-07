package com.itheima.mp.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mp.domain.po.Stage;
import com.itheima.mp.mapper.StageMapper;
import com.itheima.mp.service.StageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageServiceImpl extends ServiceImpl<StageMapper, Stage> implements StageService {
    @Override
    public List<Stage> getStagesByPlanId(Integer planId) {
        QueryWrapper<Stage> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("PLAN_ID", planId);
        return this.list(queryWrapper);
    }
}
