package tk.mybatis.web.mapper;

import tk.mybatis.web.model.TextMessage;

import java.util.List;

public interface TextMessageMapper {
    List<TextMessage> selectAll();
}
