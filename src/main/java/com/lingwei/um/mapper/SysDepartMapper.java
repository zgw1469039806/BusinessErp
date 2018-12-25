package com.lingwei.um.mapper;

import com.lingwei.um.entity.SysDepart;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 部门表结构 Mapper 接口
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Component
public interface SysDepartMapper extends BaseMapper<SysDepart> {


    List<SysDepart> selById(Integer id);
}
