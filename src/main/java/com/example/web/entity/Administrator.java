package com.example.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class Administrator implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Administratorid", type = IdType.AUTO)
    private String administratorid;

    private String administratorname;


}
