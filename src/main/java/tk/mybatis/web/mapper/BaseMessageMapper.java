package tk.mybatis.web.mapper;

import tk.mybatis.web.model.BaseMessage;

import java.util.List;


/**
 * @since 2018/7/31
 * @author Quinn Tian
 * @version 0.0.1
*/
public interface BaseMessageMapper {
  /**
   * Query the baseMessage
   * <p>Create by Quinn Tian
   * <p>Last modified date 2018/7/31 10:53
   * @param
   * @return java.util.List<tk.mybatis.web.model.BaseMessage>
   * @since 2018/7/31 10:53
   */
  List<BaseMessage> selectAll();
  /**
   * Insert the one of baseMessage
   * <p>Create by Quinn Tian
   * <p>Last modified date 2018/7/31 10:53
   * @param bs
   * @return int
   * @since 2018/7/31 10:53
   */
  int insert(BaseMessage bs);
}
