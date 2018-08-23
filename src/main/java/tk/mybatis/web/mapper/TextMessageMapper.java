package tk.mybatis.web.mapper;


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
     *
     * <p>Create by Quinn Tian
     * <p>Last modified date 2018/7/31 10:59
     * @param tx,TextMessage
     * @return int
     * @since 2018/7/31 10:59
     */
    int insert(TextMessage tx);

    /**
     * the funciton is query the param that name is type is '1' or '0' of basemessages
     * <p>Create by Quinn Tian
     * <p>Last modified date
     * @param
     * @return
     * @since 2018/8/17 17:36
    */
    List<TextMessage> selectAllByType(Long type);

}
