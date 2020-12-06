package com.xzz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xzz.entity.Emp;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xzz
 * @since 2020-08-26
 */
public interface EmpService extends IService<Emp> {
    IPage<Map> queryAll(Map<String,String> map);
}
