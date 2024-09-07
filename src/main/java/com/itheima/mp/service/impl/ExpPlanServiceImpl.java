package com.itheima.mp.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mp.domain.po.ExpPlan;
import com.itheima.mp.mapper.ExpPlanMapper;
import com.itheima.mp.service.ExpPlanService;
import org.springframework.stereotype.Service;

@Service
public class ExpPlanServiceImpl extends ServiceImpl<ExpPlanMapper, ExpPlan> implements ExpPlanService {
}
