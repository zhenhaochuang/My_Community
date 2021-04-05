package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    //查询当前用户的绘画列表
    List<Message> selectConversations(int userId,int offset,int limit);

    int selectConversationCount(int userId);

    List<Message> selectLetters(String conversationId,int offset,int limit);

    int selectLetterCount(String conversationId);

    int selectLetterUnreadCount(int userId,String conversationId);

    //新增消息
    int insertMessage(Message message);

    //修改消息的状态
    int updateStatus(List<Integer> ids,int status);

    //查询某个主题下最新的通知
    Message selectLatestNotice(int userId,String topic);

    //查询某个主题所包含的通知数量
    int selectNoticeCount(int userId,String topic);

    int selectNoticeUnreadCount(int userId,String topic);

    List<Message> selectNotices(int userId,String topic,int offset,int limit);

}
