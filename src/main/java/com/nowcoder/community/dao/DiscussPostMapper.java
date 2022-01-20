package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DiscussPostMapper {
    /**
     * 查询用户发布的所有帖子(分页)
     *
     * @param userId 用户id
     * @param offset 起始位置
     * @param limit  每一页的数量
     * @return
     */
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId,
                                         @Param("offset") int offset,
                                         @Param("limit") int limit,
                                         @Param("orderMode") int orderMode);

    /**
     * 根据userid 查询该用户发布的所有帖子数量
     * @Param 注解用于给参数取别名，如果只有一个参数，并且在<if>里使用，则必须加别名
     *
     * @param userId 用户id
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    /**
     * 新增一条帖子
     *
     * @param discussPost
     * @return
     */
    int insertDiscussPost(DiscussPost discussPost);

    /**
     * 根据id查询帖子
     *
     * @param id
     * @return
     */
    DiscussPost selectDiscussPostById(@Param("id") int id);

    /**
     * 修改评论数量
     *
     * @param id
     * @param commentCount
     * @return
     */
    int updateCommentCount(@Param("id") int id,
                           @Param("commentCount") int commentCount);

    /**
     * 根据id修改帖子类型
     *
     * @param id
     * @param type
     * @return
     */
    int updateType(@Param("id") int id, @Param("type") int type);

    /**
     * 根据id修改帖子状态
     *
     * @param id
     * @param status
     * @return
     */
    int updateStatus(@Param("id") int id, @Param("status") int status);

    /**
     * 修改帖子分数
     * @param id
     * @param score
     * @return
     */
    int updateScore(@Param("id")int id,@Param("score") double score);
}
