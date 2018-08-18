package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import sun.plugin2.message.Message;
import tk.mybatis.web.mapper.TextMessageMapper;
import tk.mybatis.web.model.Image;
import tk.mybatis.web.model.ImageMessage;
import tk.mybatis.web.model.TextMessage;
import tk.mybatis.web.util.MessageUtil;

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
    @Test
    public void selectallByType(){
        SqlSession sqlSession = getSqlSession();
        try {

            TextMessageMapper textMessageMapper = sqlSession.getMapper(TextMessageMapper.class);
            List<TextMessage> textMessages = textMessageMapper.selectAllByType((long) 1);
            System.out.println(textMessages);
        }finally {
            getSqlSession().close();
        }


    }

    @Test
    public void insert(){
        SqlSession sqlSession = getSqlSession();
        try {

            TextMessageMapper textMessageMapper = sqlSession.getMapper(TextMessageMapper.class);
            TextMessage tx = new TextMessage();
            tx.setType(1);
            tx.setContent("test one");
            textMessageMapper.insert(tx);
            //System.out.println(textMessages);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }


    }
    @Test
   public void testImageToXml(){
       ImageMessage imageMessage =new ImageMessage();
       //imageMessage.setIId();
       //imageMessage.

       //System.out.println(MessageUtil.imageMessageToXml(imageMessage));
   }
}
