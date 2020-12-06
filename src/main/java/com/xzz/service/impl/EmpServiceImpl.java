package com.xzz.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzz.entity.Emp;
import com.xzz.mapper.EmpMapper;
import com.xzz.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xzz
 * @since 2020-08-26
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public IPage<Map> queryAll(Map<String,String> map) {
        int curPage=map.get("curPage")!=null?Integer.valueOf(map.get("curPage")):1;
        int pageSize=map.get("pageSize")!=null?Integer.valueOf(map.get("pageSize")):10;
        IPage<Map> page=new Page<>(curPage,pageSize);
        return empMapper.queryAll(page,map);
    }
}
