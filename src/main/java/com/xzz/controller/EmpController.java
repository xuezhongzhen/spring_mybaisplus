package com.xzz.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xzz.entity.AjaxResult;
import com.xzz.entity.Emp;
import com.xzz.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xzz
 * @since 2020-08-26
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/list")
    public IPage<Map> queryAll(@RequestParam Map<String,String> map){
        return empService.queryAll(map);
    }

    @RequestMapping("/saveOrUpdate")
    public AjaxResult saveOrUpdate(@RequestBody Emp emp){
        boolean b = empService.saveOrUpdate(emp);
        if(b){
            return AjaxResult.success();
        }else{
            return AjaxResult.error();
        }
    }

    @RequestMapping("/query")
    public Emp query(@RequestParam Map<String,String> map){
        System.out.println(map);
        return null;
    }


}

