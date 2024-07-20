package com.example.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wang
 * @since 2024-07-19
 */
@Getter
@Setter
@Accessors(chain = true)
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SalaryID", type = IdType.AUTO)
    private String salaryID;

    private BigDecimal salaryM;

    private BigDecimal basicSalary;

    private BigDecimal personalIncome;

    private BigDecimal bonus;

    @TableId(value = "PayDate", type = IdType.AUTO)
    private LocalDate payDate;

    private BigDecimal taxRate;


}
