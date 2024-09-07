package com.itheima.mp.controller;

import com.itheima.mp.domain.po.TrialResourceParticipation;
import com.itheima.mp.service.TrialResourceParticipationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "陪试资源参与度管理")
@RestController
@RequestMapping("/trialResourceParticipation")
public class TrialResourceParticipationController {

    @Autowired
    private TrialResourceParticipationService service;

    @ApiOperation("根据ID获取陪试资源参与度")
    @GetMapping("/list/{id}")
    public TrialResourceParticipation getById(@ApiParam("资源参与度ID") @PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @ApiOperation("获取所有陪试资源参与度")
    @GetMapping
    public List<TrialResourceParticipation> listAll() {
        return service.list();
    }

    @ApiOperation("新增陪试资源参与度")
    @PostMapping
    public boolean save(@ApiParam("陪试资源参与度实体") @RequestBody TrialResourceParticipation participation) {
        return service.save(participation);
    }

    @ApiOperation("更新陪试资源参与度")
    @PutMapping
    public boolean update(@ApiParam("陪试资源参与度实体") @RequestBody TrialResourceParticipation participation) {
        return service.updateById(participation);
    }

    @ApiOperation("根据ID删除陪试资源参与度")
    @DeleteMapping("/{id}")
    public boolean deleteById(@ApiParam("资源参与度ID") @PathVariable("id") Integer id) {
        return service.removeById(id);
    }
}
