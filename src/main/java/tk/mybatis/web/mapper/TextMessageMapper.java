package tk.mybatis.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.web.model.TextMessage;

import java.util.List;

public interface TextMessageMapper {
    List<TextMessage> selectAll();
    int insert(TextMessage tx);
}
