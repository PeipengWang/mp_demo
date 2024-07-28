package com.itheima.mp.domain.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


import java.io.Serializable;

@Data
@ApiModel("地址实体表")
public class AddressDTO implements Serializable {

    @ApiModelProperty(value = "id", example = "1")
    private Long id;

    @ApiModelProperty(value = "用户ID", example = "123")
    private Long userId;

    @ApiModelProperty(value = "省", example = "山东省")
    private String province;

    @ApiModelProperty(value = "市", example = "济南市")
    private String city;

    @ApiModelProperty(value = "县/区", example = "历下区")
    private String town;

    @ApiModelProperty(value = "手机", example = "13800138000")
    private String mobile;

    @ApiModelProperty(value = "详细地址", example = "XXX街道XXX号")
    private String street;

    @ApiModelProperty(value = "联系人", example = "张三")
    private String contact;

    @ApiModelProperty(value = "是否是默认 1默认 0否", example = "true")
    private Boolean isDefault;

    @ApiModelProperty(value = "备注", example = "备注信息")
    private String notes;

    @ApiModelProperty(value = "逻辑删除", example = "false")
    private Boolean deleted;
}
