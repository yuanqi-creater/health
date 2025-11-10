package com.health.reservation.service;

import java.util.List;
import com.health.reservation.domain.TCheckgroup;
import com.health.reservation.dto.TCheckgroupDto;
import com.health.reservation.vo.TCheckgroupVo;
import org.springframework.transaction.annotation.Transactional;

/**
 * 检查组管理Service接口
 * 
 * @author 1926
 * @date 2025-11-08
 */
public interface ITCheckgroupService 
{
    /**
     * 查询检查组管理
     * 
     * @param id 检查组管理主键
     * @return 检查组管理
     */
    public TCheckgroupVo selectTCheckgroupById(Long id);

    /**
     * 查询检查组管理列表
     * 
     * @param tCheckgroup 检查组管理
     * @return 检查组管理集合
     */
    public List<TCheckgroup> selectTCheckgroupList(TCheckgroup tCheckgroup);

    /**
     * 新增检查组管理
     * 
     * @param dto 检查组管理
     * @return 结果
     */
    public int insertTCheckgroup(TCheckgroup dto);

    @Transactional
    int insertTCheckgroup(TCheckgroupDto dto);

    /**
     * 修改检查组管理
     * 
     * @param dto 检查组管理
     * @return 结果
     */
    public int updateTCheckgroup(TCheckgroupDto dto);

    /**
     * 批量删除检查组管理
     * 
     * @param id 需要删除的检查组管理主键集合
     * @return 结果
     */
    public int deleteTCheckgroupByIds(Long[] id);

    /**
     * 删除检查组管理信息
     * 
     * @param id 检查组管理主键
     * @return 结果
     */
    public int deleteTCheckgroupById(Long id);
}
