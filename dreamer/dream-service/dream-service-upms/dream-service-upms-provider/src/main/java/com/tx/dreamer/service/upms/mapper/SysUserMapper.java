package com.tx.dreamer.service.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tx.dreamer.service.upms.api.model.SysUserModel;
import com.tx.dreamer.service.upms.po.SysUser;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author houxi
 * @since 2019-10-23
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    IPage<SysUser> find(IPage<SysUser> page, SysUserModel userModel);

    SysUser findByPhoneNumber(String phoneNumber);

    SysUser findByUserName(String userName);

}
