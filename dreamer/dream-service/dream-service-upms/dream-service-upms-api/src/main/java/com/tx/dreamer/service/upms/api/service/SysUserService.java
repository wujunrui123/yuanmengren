package com.tx.dreamer.service.upms.api.service;

import com.tx.dreamer.service.upms.api.vo.SysUserVO;
import com.tx.dreamer.service.upms.api.model.SysUserModel;
import com.tx.framework.common.vo.PageVO;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author houxi
 * @since 2019-10-23
 */
public interface SysUserService {

    /**
     * 新增用户
     * @param userModel
     */
    void add(SysUserModel userModel);

    PageVO<SysUserVO> find(SysUserModel userModel);

    SysUserVO findByPhoneNumber(String phoneNumber);

    SysUserVO findByUserName(String userName);

    boolean updatePasswordById(Long id,String password);

    boolean updateUserById(SysUserModel userModel);

    void updateLoginInfo(Long id, String loginIp);


}
