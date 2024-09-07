package com.itheima.mp.controller;


import com.itheima.mp.domain.po.ExpSubject;
import com.itheima.mp.domain.po.Stage;
import com.itheima.mp.service.ExpSubjectService;
import com.itheima.mp.service.StageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "阶段管理")
@RestController
@RequestMapping("/stage")
public class StageController {

    @Autowired
    private StageService stageService;

    @Autowired
    private ExpSubjectService expSubjectService;

    @ApiOperation("根据id获取阶段（不包括方案）")
    @GetMapping("/{id}")
    public Stage getById(@PathVariable Integer id) {
        return stageService.getById(id);
    }

    @ApiOperation("获取所有阶段")
    @GetMapping("/list")
    public List<Stage> list() {
        return stageService.list();
    }

    @ApiOperation("根据id获取阶段（包括方案）")
    @GetMapping("/getStageByIdIncludeSub/{id}")
    public Stage getStageByIdIncludeSub(@PathVariable("id") Integer id) {
        Stage stage = stageService.getById(id);
        List<ExpSubject> expSubjectsByStageIdAndPlanId = expSubjectService.getExpSubjectsByStageId(stage.getId());
        stage.setSubjects(expSubjectsByStageIdAndPlanId);
        return stage;
    }

    @PostMapping
    public boolean save(@RequestBody Stage stage) {
        return stageService.save(stage);
    }

    @PutMapping
    public boolean update(@RequestBody Stage stage) {
        return stageService.updateById(stage);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return stageService.removeById(id);
    }
}