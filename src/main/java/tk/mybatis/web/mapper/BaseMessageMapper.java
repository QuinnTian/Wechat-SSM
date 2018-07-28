package tk.mybatis.web.mapper;

import tk.mybatis.web.model.BaseMessage;

import java.util.List;

public interface BaseMessageMapper {
  List<BaseMessage> selectAll();
  int insert(BaseMessage bs);
}
