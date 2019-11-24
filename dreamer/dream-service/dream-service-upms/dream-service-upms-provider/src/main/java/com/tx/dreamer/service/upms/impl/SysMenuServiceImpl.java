package com.tx.dreamer.service.upms.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tx.dreamer.service.upms.api.model.SysMenuModel;
import com.tx.dreamer.service.upms.api.service.SysMenuService;
import com.tx.dreamer.service.upms.mapper.SysMenuMapper;
import com.tx.dreamer.service.upms.po.SysMenu;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author houxi
 * @since 2019-10-24
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Override
    public void add(SysMenuModel sysMenuModel) {

    }
}
