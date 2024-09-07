package com.itheima.mp.controller;


import com.itheima.mp.domain.po.ExpSubject;
import com.itheima.mp.service.ExpSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "方案管理")
@RestController
@RequestMapping("/expSubject")
public class ExpSubjectController {

    @Autowired
    private ExpSubjectService expSubjectService;

    @ApiOperation("根据id获取方案")
    @GetMapping("/{id}")
    public ExpSubject getById(@PathVariable Integer id) {
        return expSubjectService.getById(id);
    }

    @ApiOperation("获取所有方案")
    @GetMapping("/list")
    public List<ExpSubject> list() {
        return expSubjectService.list();
    }

    @PostMapping
    public boolean save(@RequestBody ExpSubject expSubject) {
        return expSubjectService.save(expSubject);
    }

    @PutMapping
    public boolean update(@RequestBody ExpSubject expSubject) {
        return expSubjectService.updateById(expSubject);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return expSubjectService.removeById(id);
    }
}
