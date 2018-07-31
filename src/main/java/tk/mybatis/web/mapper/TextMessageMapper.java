package tk.mybatis.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.web.model.TextMessage;

import java.util.List;
/**
 * @since 2018/7/31
 * @author Quinn Tian
 * @version 0.0.1
*/
public interface TextMessageMapper {
    /**
     * <p>Create by Quinn Tian
     * <p>Last modified date 2018/7/31 10:59
     * @param
     * @return java.util.List<tk.mybatis.web.model.TextMessage>
     * @since 2018/7/31 10:59
     */
    List<TextMessage> selectAll();
    /**
     * <p>Create by Quinn Tian
     * <p>Last modified date 2018/7/31 10:59
     * @param tx,TextMessage
     * @return int
     * @since 2018/7/31 10:59
     */
    int insert(TextMessage tx);
}
