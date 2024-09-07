package com.itheima.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mp.domain.po.ExperimentCompletionProgress;
import com.itheima.mp.mapper.ExperimentCompletionProgressMapper;
import com.itheima.mp.service.ExperimentCompletionProgressService;
import org.springframework.stereotype.Service;

@Service
public class ExperimentCompletionProgressServiceImpl extends ServiceImpl<ExperimentCompletionProgressMapper,
        ExperimentCompletionProgress>
        implements ExperimentCompletionProgressService {
    // 自定义业务逻辑可以在这里实现
}
