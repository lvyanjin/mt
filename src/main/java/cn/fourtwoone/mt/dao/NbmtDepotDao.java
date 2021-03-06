package cn.fourtwoone.mt.dao;

import cn.fourtwoone.mt.entity.NbmtDepot;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 仓库表(NbmtDepot)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */


public interface NbmtDepotDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtDepot queryById(Long id);

//    List<NbmtDepot> queryAll();
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtDepot> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nbmtDepot 实例对象
     * @return 对象列表
     */
    List<NbmtDepot> queryAll(NbmtDepot nbmtDepot);

    /**
     * 新增数据
     *
     * @param nbmtDepot 实例对象
     * @return 影响行数
     */
    int insert(NbmtDepot nbmtDepot);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtDepot> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NbmtDepot> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtDepot> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NbmtDepot> entities);

    /**
     * 修改数据
     *
     * @param nbmtDepot 实例对象
     * @return 影响行数
     */
    int update(NbmtDepot nbmtDepot);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

