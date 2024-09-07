package com.itheima.mp.controller;


import com.itheima.mp.domain.po.ExpPlan;
import com.itheima.mp.domain.po.ExpSubject;
import com.itheima.mp.domain.po.Stage;
import com.itheima.mp.service.ExpPlanService;
import com.itheima.mp.service.ExpSubjectService;
import com.itheima.mp.service.StageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "试验管理")
@RestController
@RequestMapping("/expPlan")
public class ExpPlanController {

    @Autowired
    private ExpPlanService expPlanService;

    @Autowired
    private StageService stageService;

    @Autowired
    private ExpSubjectService expSubjectService;

    @ApiOperation("根据试验id获取试验（不包括阶段）")
    @GetMapping("getExpById/{id}")
    public ExpPlan getById(@ApiParam("方案id") @PathVariable Integer id) {
        return expPlanService.getById(id);
    }
    @ApiOperation("根据试验id获取试验（包括阶段和方案）")
    @GetMapping("getEXPIncludeStaById/{id}")
    public ExpPlan getExpIncludeStaById(@ApiParam("方案id") @PathVariable Integer id) {
        ExpPlan expPlan = expPlanService.getById(id);
        List<Stage> stagesByPlanId = stageService.getStagesByPlanId(expPlan.getId());
        for (Stage stage : stagesByPlanId) {
            List<ExpSubject> expSubjectsByStageIdAndPlanId = expSubjectService.
                    getExpSubjectsByStageIdAndPlanId(stage.getPlanId(), expPlan.getId());
            stage.setSubjects(expSubjectsByStageIdAndPlanId);
        }
        expPlan.setStages(stagesByPlanId);
        return expPlan;
    }

    @ApiOperation("获取所有试验（不包括阶段和方案）")
    @GetMapping("getAllEXP")
    public List<ExpPlan> getAllEXP() {
        List<ExpPlan> list = expPlanService.list();
        return list;
    }

    @ApiOperation("获取所有试验（包括阶段和方案）")
    @GetMapping("getAllEXPIncludeSta")
    public List<ExpPlan> getAllEXPIncludeStage() {
        List<ExpPlan> exPlans = expPlanService.list();
        for (ExpPlan exPlan: exPlans) {
            List<Stage> stagesByPlanId = stageService.getStagesByPlanId(exPlan.getId());
            for (Stage stage : stagesByPlanId) {
                List<ExpSubject> expSubjectsByStageIdAndPlanId = expSubjectService.
                        getExpSubjectsByStageIdAndPlanId(stage.getPlanId(), exPlan.getId());
                stage.setSubjects(expSubjectsByStageIdAndPlanId);
            }
            exPlan.setStages(stagesByPlanId);
        }
        return exPlans;
    }

    @GetMapping("/list")
    public List<ExpPlan> list() {
        return expPlanService.list();
    }

    @PostMapping
    public boolean save(@RequestBody ExpPlan expPlan) {
        return expPlanService.save(expPlan);
    }

    @PutMapping
    public boolean update(@RequestBody ExpPlan expPlan) {
        return expPlanService.updateById(expPlan);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return expPlanService.removeById(id);
    }
}
