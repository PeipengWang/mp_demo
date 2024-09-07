package com.itheima.mp.controller;


import com.itheima.mp.domain.po.SatellitePayload;
import com.itheima.mp.service.SatellitePayloadService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "卫星载荷管理")
@RestController
@RequestMapping("/satellitePayload")
public class SatellitePayloadController {

    @Autowired
    private SatellitePayloadService satellitePayloadService;

    @GetMapping("/list")
    public List<SatellitePayload> list() {
        return satellitePayloadService.list();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody SatellitePayload satellitePayload) {
        return satellitePayloadService.save(satellitePayload);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody SatellitePayload satellitePayload) {
        return satellitePayloadService.updateById(satellitePayload);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return satellitePayloadService.removeById(id);
    }
}
