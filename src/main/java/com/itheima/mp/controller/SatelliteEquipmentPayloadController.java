package com.itheima.mp.controller;


import com.itheima.mp.domain.po.SatelliteEquipmentPayload;
import com.itheima.mp.service.SatelliteEquipmentPayloadService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "卫星载荷关联装备管理")
@RestController
@RequestMapping("/satelliteEquipmentPayload")
public class SatelliteEquipmentPayloadController {

    @Autowired
    private SatelliteEquipmentPayloadService satelliteEquipmentPayloadService;

    @GetMapping("/list")
    public List<SatelliteEquipmentPayload> list() {
        return satelliteEquipmentPayloadService.list();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody SatelliteEquipmentPayload satelliteEquipmentPayload) {
        return satelliteEquipmentPayloadService.save(satelliteEquipmentPayload);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody SatelliteEquipmentPayload satelliteEquipmentPayload) {
        return satelliteEquipmentPayloadService.updateById(satelliteEquipmentPayload);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return satelliteEquipmentPayloadService.removeById(id);
    }
}
