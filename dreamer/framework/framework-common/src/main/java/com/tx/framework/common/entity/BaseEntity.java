package com.tx.framework.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author houxi
 * @date 2019/10/16 14:38
 **/
@Data
public abstract class BaseEntity implements Serializable {

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @TableLogic
    protected boolean isDeleted = false;

    @Version
    private Integer version;

    private Date createTime;

    private Date updateTime;
}

