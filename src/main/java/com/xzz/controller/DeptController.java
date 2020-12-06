package com.xzz.controller;


import com.xzz.entity.Dept;
import com.xzz.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xzz
 * @since 2020-08-27
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public List<Dept> query(){
        return deptService.list();
    }
}
