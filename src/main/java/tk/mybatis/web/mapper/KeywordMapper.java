package tk.mybatis.web.mapper;


import tk.mybatis.web.model.Keyword;
import tk.mybatis.web.model.TextMessage;

import java.util.List;

/**
 * @since 2018/7/31
 * @author Quinn Tian
 * @version 0.0.1
*/
public interface KeywordMapper {
    public int insertKeyword(Keyword keyword);
}
