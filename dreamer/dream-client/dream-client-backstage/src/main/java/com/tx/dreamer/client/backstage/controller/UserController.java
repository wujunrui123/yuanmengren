package com.tx.dreamer.client.backstage.controller;

import com.tx.dreamer.client.backstage.service.UserService;
import com.tx.dreamer.service.upms.api.model.SysUserModel;
import com.tx.dreamer.service.upms.api.vo.SysUserVO;
import com.tx.framework.common.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author houxi
 * @date 2019/10/22 11:51
 **/
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "add")
    public ResponseEntity<Void> add(@RequestBody SysUserModel userModel){
        userService.add(userModel);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "findByUserName")
    public SysUserVO findByUsername(String username) {
        SysUserVO userVO = userService.findByUserName(username);
        return userVO;
    }

    @GetMapping(value = "findBySysUserModel")
    public PageVO<SysUserVO> findBySysUserModel(SysUserModel userModel) {
        PageVO<SysUserVO> pageVO = userService.findBySysUserModel(userModel);
        return pageVO;
    }
}
