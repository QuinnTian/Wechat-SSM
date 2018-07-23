package tk.mybatis.web.mapper;

import tk.mybatis.web.model.Message;

import java.util.List;

public interface MessageReplyMapper {
    /**
     * 批量插入信息
     * @param ms
     * @return
     */
    public int insertMessageReply(List<Message> ms);

    public List<Message> queryAllMessageReply();
}
