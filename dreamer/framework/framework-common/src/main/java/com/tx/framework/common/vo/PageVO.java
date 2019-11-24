package com.tx.framework.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * @author houxi
 * @version 1.0
 * @date 2019/10/23 16:58
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class PageVO<T> implements Serializable {
    private final Long total;
    private final List<T> content;

    public PageVO(List<T> content, Long total) {
        this.total = total;
        this.content = content;
    }

}
