package com.tx.framework.common.model;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author houxi
 * @version 1.0
 * @date 2019/10/24 14:25
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class PageModel implements Serializable{

    /***
     * 页号
     */
    private Integer pageNum = 1;

    /***
     * 每页大小
     */
    private Integer pageSize = 10;

    /**
     * 排序
     */
    private List<OrderItem> orderItems;

}
