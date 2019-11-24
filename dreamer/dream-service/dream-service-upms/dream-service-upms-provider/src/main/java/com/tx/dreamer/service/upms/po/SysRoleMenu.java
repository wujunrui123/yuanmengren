package com.tx.dreamer.service.upms.po;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色和菜单关联表
 * </p>
 *
 * @author houxi
 * @since 2019-10-24
 */
@Data
@Accessors(chain = true)
public class SysRoleMenu {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;


}
