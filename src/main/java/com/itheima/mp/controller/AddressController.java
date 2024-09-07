package com.itheima.mp.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.itheima.mp.domain.dto.AddressDTO;
import com.itheima.mp.domain.po.Address;
import com.itheima.mp.domain.po.User;
import com.itheima.mp.mapper.AddressMapper;
import com.itheima.mp.service.impl.AddressServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-10-25
 */
@Api(tags = "地址接口")
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;


    @ApiOperation("根据ID获取地址")
    @GetMapping("/{id}")
    public Address getAddress(@ApiParam("id值") @PathVariable("id") Long id){
        return addressService.getById(id);
    }

    @ApiOperation("存储地址")
    @PostMapping("/save")
    public boolean saveAddress(@RequestBody AddressDTO addressDTO){
        Address address = BeanUtil.copyProperties(addressDTO, Address.class);
        if (addressService.save(address)){
            return true;
        }

        return false;
    }

    @ApiOperation("根据地址名称查询")
    @GetMapping("/listByName/{addressName}")
    public List<Address> geAddressByName(@ApiParam("地址名称") @PathVariable(required = false) String addressName){
        LambdaQueryWrapper<Address> queryWrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<Address> eq = queryWrapper.eq(Address::getCity, addressName);
        return addressService.list(eq);

    }


    @ApiOperation("修改某个id的电话号码")
    @PostMapping("/{id}/update/{phone}")
    public boolean deleteAddress(
            @ApiParam("地址id") @PathVariable(required = false) Long id,
            @ApiParam("地址电话") @PathVariable(required = false) String phone){
        LambdaUpdateWrapper<Address> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        LambdaUpdateWrapper<Address> eq = lambdaUpdateWrapper.eq(Address::getId, id);
        Address address = addressService.getById(id);
        if(address != null){
            address.setMobile(phone);
            return addressService.update(address, eq);
        }
        return true;

    }
}
