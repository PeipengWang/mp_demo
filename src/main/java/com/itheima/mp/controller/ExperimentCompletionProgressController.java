package com.itheima.mp.controller;

import com.itheima.mp.domain.po.ExperimentCompletionProgress;
import com.itheima.mp.service.ExperimentCompletionProgressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "试验完成进度管理")
@RestController
@RequestMapping("/experimentCompletionProgress")
public class ExperimentCompletionProgressController {

    @Autowired
    private ExperimentCompletionProgressService service;

    @ApiOperation("根据ID获取试验完成进度")
    @GetMapping("/list/{id}")
    public ExperimentCompletionProgress getById(@ApiParam("进度ID") @PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @ApiOperation("获取所有试验完成进度")
    @GetMapping
    public List<ExperimentCompletionProgress> listAll() {
        return service.list();
    }

    @ApiOperation("新增试验完成进度")
    @PostMapping
    public boolean save(@ApiParam("试验完成进度实体") @RequestBody ExperimentCompletionProgress progress) {
        return service.save(progress);
    }

    @ApiOperation("更新试验完成进度")
    @PutMapping
    public boolean update(@ApiParam("试验完成进度实体") @RequestBody ExperimentCompletionProgress progress) {
        return service.updateById(progress);
    }

    @ApiOperation("根据ID删除试验完成进度")
    @DeleteMapping("/{id}")
    public boolean deleteById(@ApiParam("进度ID") @PathVariable("id") Integer id) {
        return service.removeById(id);
    }
}
