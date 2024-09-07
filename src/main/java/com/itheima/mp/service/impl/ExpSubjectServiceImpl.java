package com.itheima.mp.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mp.domain.po.ExpSubject;
import com.itheima.mp.mapper.ExpSubjectMapper;
import com.itheima.mp.service.ExpSubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpSubjectServiceImpl extends ServiceImpl<ExpSubjectMapper, ExpSubject> implements ExpSubjectService {


    @Override
    public List<ExpSubject> getExpSubjectsByStageIdAndPlanId(Integer stageId, Integer planId) {
        QueryWrapper<ExpSubject> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("STAGE_ID", stageId).eq("PLAN_ID", planId);
        return this.getBaseMapper().selectList(queryWrapper);
    }

    @Override
    public List<ExpSubject> getExpSubjectsByStageId(Integer stageId) {
        QueryWrapper<ExpSubject> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("STAGE_ID", stageId);
        return this.getBaseMapper().selectList(queryWrapper);
    }
}
