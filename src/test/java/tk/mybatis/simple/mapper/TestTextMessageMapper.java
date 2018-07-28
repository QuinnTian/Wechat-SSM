package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import tk.mybatis.web.mapper.TextMessageMapper;
import tk.mybatis.web.model.TextMessage;

import java.util.List;

public class TestTextMessageMapper extends BaseMapperTest {
    @Test
    public void selectall(){
        SqlSession sqlSession = getSqlSession();
        try {

            TextMessageMapper textMessageMapper = sqlSession.getMapper(TextMessageMapper.class);
            List<TextMessage> textMessages = textMessageMapper.selectAll();
            System.out.println(textMessages);
        }finally {
            getSqlSession().close();
        }


    }

}
