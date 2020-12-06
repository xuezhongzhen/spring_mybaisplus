package com.xzz.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xzz
 * @since 2020-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Emp implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "empno", type = IdType.AUTO)
    private Integer empno;

    private String ename;

    private String job;

    private String sex;

    private Integer deptno;

    private Date hiredate;

    private BigDecimal sal;


}
