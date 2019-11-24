package com.tx.dreamer.service.upms.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tx.dreamer.service.upms.api.model.SysRoleModel;
import com.tx.dreamer.service.upms.api.service.SysRoleService;
import com.tx.dreamer.service.upms.mapper.SysRoleMapper;
import com.tx.dreamer.service.upms.po.SysRole;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author houxi
 * @since 2019-10-24
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public void add(SysRoleModel sysRoleModel) {

    }
}
