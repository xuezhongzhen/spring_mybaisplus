package com.xzz.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xzz.entity.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xzz
 * @since 2020-08-26
 */
@Repository
public interface EmpMapper extends BaseMapper<Emp> {
    //    @Param ：mybatis注解，给参数起个名
    IPage<Map> queryAll(IPage<Map> pager,@Param("params") Map<String,String> map);
}
