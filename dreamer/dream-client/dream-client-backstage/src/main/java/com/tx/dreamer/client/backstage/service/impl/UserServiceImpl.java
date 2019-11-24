package com.tx.dreamer.client.backstage.service.impl;

import com.tx.dreamer.client.backstage.service.UserService;
import com.tx.dreamer.service.upms.api.model.SysUserModel;
import com.tx.dreamer.service.upms.api.service.SysUserService;
import com.tx.dreamer.service.upms.api.vo.SysUserVO;
import com.tx.framework.common.vo.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author houxi
 * @date 2019/10/22 11:53
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Reference
    private SysUserService sysUserService;

    @Override
    public void add(SysUserModel userModel) {
        sysUserService.add(userModel);
    }

    @Override
    public SysUserVO findByUserName(String username) {
        return sysUserService.findByUserName(username);
    }

    @Override
    public PageVO<SysUserVO> findBySysUserModel(SysUserModel userModel) {
        sysUserService.add(userModel);
//        PageVO<SysUserVO> pageVO = sysUserService.findBySysUserModel(new SysUserModel());
        return null;
    }
}
