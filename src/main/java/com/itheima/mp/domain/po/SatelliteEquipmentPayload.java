package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("SATELLITE_EQUIPMENT_PAYLOAD")
public class SatelliteEquipmentPayload {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    private Long equipmentId;
    private Long payloadId;
}
