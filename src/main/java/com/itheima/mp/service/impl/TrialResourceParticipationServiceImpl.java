package com.itheima.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mp.domain.po.TrialResourceParticipation;
import com.itheima.mp.mapper.TrialResourceParticipationMapper;
import com.itheima.mp.service.TrialResourceParticipationService;
import org.springframework.stereotype.Service;

@Service
public class TrialResourceParticipationServiceImpl extends ServiceImpl<TrialResourceParticipationMapper, TrialResourceParticipation> 
        implements TrialResourceParticipationService {
    // 自定义业务逻辑可以在这里实现
}
