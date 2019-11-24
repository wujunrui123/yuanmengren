package com.tx.dreamer.client.backstage.service;

import com.tx.dreamer.service.upms.api.model.SysUserModel;
import com.tx.dreamer.service.upms.api.vo.SysUserVO;
import com.tx.framework.common.vo.PageVO;

/**
 * @author houxi
 * @date 2019/10/22 11:52
 **/
public interface UserService {

    void add(SysUserModel userModel);

    SysUserVO findByUserName(String username);

    PageVO<SysUserVO> findBySysUserModel(SysUserModel userModel);
}
