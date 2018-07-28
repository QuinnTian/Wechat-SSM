package tk.mybatis.simple.mapper;

import org.junit.Test;
import tk.mybatis.web.model.TextMessage;
import tk.mybatis.web.util.MessageUtil;

public class MainTest {
    /**
     * 测试转换XML 使用注解方式并将属性的首字母转换为大写
     */
    @Test
    public void testToXml(){
        TextMessage textMessage = new TextMessage();
        textMessage.setContent("测试内容");
        textMessage.setMsgId((long) 999999999);
        String xml=MessageUtil.textMessageToXml(textMessage);
        System.out.println(xml);
    }
}
