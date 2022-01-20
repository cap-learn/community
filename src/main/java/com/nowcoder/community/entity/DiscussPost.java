package com.nowcoder.community.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther: csp1999
 * @Date: 2020/11/24/8:55
 * @Description: 帖子实体类
 */
// Lombok 相关注解
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiscussPost {

    /**
     * 主键id
     */
    private int id;

    /**
     * 用户主键id
     */
    private int userId;

    /**
     * 帖子标题
     */
    private String title;

    /**
     * 帖子内容
     */
    private String content;

    /**
     * 帖子类型
     * 0-普通; 1-置顶;
     */
    private int type;

    /**
     * 帖子状态
     * 0-正常; 1-精华; 2-拉黑;
     */
    private int status;

    /**
     * 帖子创建日期
     */
    private Date createTime;

    /**
     * 帖子评论数量
     */
    private int commentCount;

    /**
     * 帖子得分
     */
    private double score;
}

