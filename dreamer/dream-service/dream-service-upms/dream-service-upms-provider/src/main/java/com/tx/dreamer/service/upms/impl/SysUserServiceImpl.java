package com.tx.dreamer.service.upms.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tx.dreamer.service.upms.api.model.SysUserModel;
import com.tx.dreamer.service.upms.api.service.SysUserService;
import com.tx.dreamer.service.upms.api.vo.SysUserVO;
import com.tx.dreamer.service.upms.mapper.SysUserMapper;
import com.tx.dreamer.service.upms.po.SysUser;
import com.tx.framework.common.model.PageModel;
import com.tx.framework.common.util.ConversionBeanUtil;
import com.tx.framework.common.vo.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author houxi
 * @since 2019-10-23
 */
@Service
@Slf4j
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    private final static ConversionBeanUtil<SysUser> toSysUser = new ConversionBeanUtil<>();

    private final static ConversionBeanUtil<SysUserVO> toSysUserVO = new ConversionBeanUtil<>();

    @Override
    public void add(SysUserModel userModel) {
        this.save(toSysUser.toBean(userModel, new SysUser()));
    }

    @Override
    public PageVO<SysUserVO> find(SysUserModel userModel) {
//        Page<SysUser> page = buildPage(userModel);
//        IPage<SysUser> sysUsers = sysUserMapper.find(page, userModel);
//        return new PageVO<>(toSysUserVO.toList(sysUsers.getRecords(),new SysUserVO()),sysUsers.getTotal());
        return null;
    }


    @Override
    public SysUserVO findByPhoneNumber(String phoneNumber) {
        SysUser sysUser = sysUserMapper.findByPhoneNumber(phoneNumber);
        return toSysUserVO.toBean(sysUser, new SysUserVO());
    }

    @Override
    public SysUserVO findByUserName(String userName) {
        SysUser sysUser = sysUserMapper.findByUserName(userName);
        return toSysUserVO.toBean(sysUser, new SysUserVO());
    }

    @Override
    public boolean updatePasswordById(Long id, String password) {
        SysUser sysUser = new SysUser().setPassword(password);
        sysUser.setId(id);
        int i = sysUserMapper.updateById(sysUser);
        return i == 1;
    }

    @Override
    public boolean updateUserById(SysUserModel userModel) {
        int i = sysUserMapper.updateById(toSysUser.toBean(userModel, new SysUser()));
        return i == 1;
    }

    @Override
    public void updateLoginInfo(Long id, String loginIp) {
        SysUser sysUser = new SysUser().setLoginIp(loginIp);
        sysUser.setId(id);
        sysUserMapper.updateById(sysUser);
    }

    private static Page<SysUser> buildPage(PageModel pageModel){
        Page<SysUser> page = new Page<>(pageModel.getPageNum(), pageModel.getPageSize());
        page.setOrders(pageModel.getOrderItems());
        return page;
    }
}
