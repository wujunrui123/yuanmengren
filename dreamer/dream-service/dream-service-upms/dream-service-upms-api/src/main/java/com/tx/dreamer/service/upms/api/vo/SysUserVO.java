package com.tx.dreamer.service.upms.api.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author houxi
 * @version 1.0
 * @date 2019/10/23 15:42
 */
@Data
@Accessors(chain = true)
public class SysUserVO implements Serializable {
    private String loginName;

    private String userName;

    private String userType;

    private String email;

    private String phoneNumber;

    private String sex;

    private String avatar;

    private String status;

    private String loginIp;

    private Date loginDate;

    private String createBy;

    private String updateBy;

    private String remark;
}
