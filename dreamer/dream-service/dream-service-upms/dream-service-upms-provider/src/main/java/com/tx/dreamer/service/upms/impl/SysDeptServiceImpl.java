package com.tx.dreamer.service.upms.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tx.dreamer.service.upms.api.model.SysDeptModel;
import com.tx.dreamer.service.upms.api.service.SysDeptService;
import com.tx.dreamer.service.upms.mapper.SysDeptMapper;
import com.tx.dreamer.service.upms.po.SysDept;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author houxi
 * @since 2019-10-24
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

    @Override
    public void add(SysDeptModel sysDeptModel) {

    }
}
