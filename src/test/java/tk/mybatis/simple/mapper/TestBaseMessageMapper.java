package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.web.mapper.BaseMessageMapper;
import tk.mybatis.web.mapper.TextMessageMapper;
import tk.mybatis.web.model.BaseMessage;
import tk.mybatis.web.model.TextMessage;

import java.util.List;

public class TestBaseMessageMapper extends BaseMapperTest {
    @Test
    public void selectall(){
        SqlSession sqlSession = getSqlSession();
        try {

            BaseMessageMapper baseMessageMapper = sqlSession.getMapper(BaseMessageMapper.class);
            List<BaseMessage> baseMessageMappers = baseMessageMapper.selectAll();
            System.out.println(baseMessageMappers);
        }finally {
            getSqlSession().close();
        }


    }
    @Test
    public void insert(){
        SqlSession sqlSession = getSqlSession();
        try {
            BaseMessageMapper baseMessageMapper = sqlSession.getMapper(BaseMessageMapper.class);
            BaseMessage baseMessage = new BaseMessage();
            baseMessage.setMsgType("1");
            int i = baseMessageMapper.insert(baseMessage);
            System.out.println(baseMessage.getId());
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

}
