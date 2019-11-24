package com.tx.framework.common.util;

import cn.hutool.core.bean.BeanUtil;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author houxi
 * @version 1.0
 * @date 2019/10/24 16:52
 */
public class ConversionBeanUtil<T> {

    public T toBean(Object source, T target){
        BeanUtil.copyProperties(source, target);
        return target;
    }

    public List<T> toList(Object source, T target){
        List<T> targetList = Lists.newArrayList();
        BeanUtil.copyProperties(source, targetList);
        return targetList;
    }
}
