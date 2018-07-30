package tk.mybatis.web.util;

import com.sun.xml.internal.ws.util.xml.XmlUtil;
import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;



import org.dom4j.io.SAXReader;
import tk.mybatis.web.model.*;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

import java.util.*;

public class MessageUtil {
    /**
     * 消息类型静态变量
     */
    public static final String MESSAGE_TEXT = "text";
    public static final String MESSAGE_IMAGE = "image";
    public static final String MESSAGE_VOICE = "voice";
    public static final String MESSAGE_VIDEO = "video";
    public static final String MESSAGE_LINK = "link";
    public static final String MESSAGE_LOCATION = "location";
    public static final String MESSAGE_EVENT = "event";
    public static final String MESSAGE_SUBSCRIBE = "subscribe";
    public static final String MESSAGE_UNSUBSCRIBE = "unsubscribe";
    public static final String MESSAGE_CLICK = "CLICK";
    public static final String MESSAGE_VIEW = "VIEW";
    private static final String MESSAGE_NEWS = "news";
    public static final String MESSAGE_MUSIC = "music";

   //map转BaseMessage工具类
    public static BaseMessage mapToBaseMessage(Map<String,String> map){
        BaseMessage bs = new BaseMessage();
        bs.setToUserName(map.get("ToUserName"));
        bs.setFromUserName(map.get("FromUserName"));
        bs.setMsgType(map.get("MsgType"));
        bs.setMsgType(map.get("CreateTime"));
       return bs;


    }
    public static TextMessage mapToTextMessage(Map<String,String> map){
        TextMessage tx = new TextMessage();
        tx.setContent(map.get("Content"));
        tx.setMsgId(Long.valueOf(map.get("MsgId")));
        return tx;


    }
    /**
     * 接收xml消息转到Map集合
     */
    public static Map<String, String> xmlToMap(HttpServletRequest request) throws IOException, DocumentException {
        Map<String, String> map = new HashMap<String, String>();

        SAXReader reader = new SAXReader();

        // 从request中获取输入流
        InputStream ins = request.getInputStream();
        Document doc = reader.read(ins);
        Element root = doc.getRootElement();// 获取根元素
        List<Element> list = root.elements();// 获取子节点集合
        // 遍历节点元素，存入Map
        for (Element element : list) {
            // 把每个元素存入map
            map.put(element.getName(), element.getText());
        }
        ins.close();// 释放输入流
        return map;
    }

    /**
     * 工具类 文本信息转换为XML
     * @param textMessage
     * @return
     */
    public static String textMessageToXml(TextMessage textMessage) {
        XStream xStream = new XStream();
        //xStream.alias("xml", textMessage.getClass());
        xStream.processAnnotations(textMessage.getClass());
        return xStream.toXML(textMessage);
    }

    /**
     * 工具类 基础信息转换为XML
     * @param baseMessage
     * @return
     */
    public static String baseMessageToXml(BaseMessage baseMessage) {
        XStream xStream = new XStream();
        //xStream.alias("xml", textMessage.getClass());
        xStream.processAnnotations(baseMessage.getClass());
        return xStream.toXML(baseMessage);
    }
    public static String initText(String toUserName,String fromUserName,
                                  String content ){
        TextMessage text = new TextMessage();
        text.setFromUserName(toUserName);
        text.setToUserName(fromUserName);
        text.setMsgType(MESSAGE_TEXT);
        text.setCreateTime(new Date().getTime());
        text.setContent(content);
        System.out.println(text);
        return textMessageToXml(text);

    }
    public static String menuText(){
        StringBuffer str = new StringBuffer();
        str.append("◆ 欢迎您的关注\n");
        str.append("------------------------------\n");
        str.append("◆ 公众号功能完善中...\n");
        str.append("◆ 如需获取资源请回复相关关键字\n");
        str.append("------------------------------\n");
        str.append("▲ 回复“help”调出此菜单\n");
        return str.toString();

    }
    public static String firstMenu(){
        StringBuffer str = new StringBuffer();
        str.append("first\n");


        return str.toString();

    }


    public static String imageMessageToXml(ImageMessage imageMessage){
        XStream xstream = new XStream();
        xstream.alias("xml", imageMessage.getClass());
        return xstream.toXML(imageMessage);
    }
    public static String initImageMessage(String toUserName,String fromUserName){
        String message = null;
        Image image = new Image();
        image.setMediaId("ENYQuY15C6Yp2e5HETVXctnZu9K1s4sJxNrnZ15fNvGsxfuhYSPYr4qxOMDoLsYT");
        ImageMessage imageMessage = new ImageMessage();
        imageMessage.setFromUserName(toUserName);
        imageMessage.setToUserName(fromUserName);
        imageMessage.setMsgType(MESSAGE_IMAGE);
        imageMessage.setCreateTime(new Date().getTime());
        imageMessage.setImage(image);
        message = imageMessageToXml(imageMessage);
        return message;
    }
    public static String musicMessageToXml(MusicMessage musicMessage){
        XStream xstream = new XStream();
        xstream.alias("xml", musicMessage.getClass());
        return xstream.toXML(musicMessage);
    }

//    public static Message mapToMessage(Map<String,String> m)  {
//
//        Message ms = new Message();
//        if(m.get("MsgId")==null){
//            ms.setMsgId(Long.valueOf(m.get("CreateTime")));
//        }else {
//            ms.setMsgId(Long.valueOf(m.get("MsgId")));
//        }
//        ms.setCreateTime(Long.valueOf(m.get("CreateTime")));
//        ms.setFromUserName(m.get("FromUserName"));
//        ms.setToUserName(m.get("ToUserName"));
//        ms.setMsgType(m.get("MsgType"));
//        ms.setContent(m.get("Content"));
//        ms.setPicUrl(m.get("PicUrl"));
//        ms.setMediaId(m.get("MediaId"));
//        ms.setFormat(m.get("Format"));
//        ms.setRecognition(m.get("Recognition"));
//        ms.setThumbMediaId(m.get("ThumbMediaId"));
//        ms.setLocationX(m.get("Location_X"));
//        ms.setLocationY(m.get("Location_Y"));
//        ms.setScale(m.get("Scale"));
//        ms.setLabel( m.get("Label"));
//        ms.setTitle(m.get("Title"));
//        ms.setDescription(m.get("Description"));
//        ms.setUrl(m.get("Url"));
//        ms.setKeyMessage(m.get("KeyMessage"));
//        System.out.println(ms.toString());


//
//		Class c = null;
//		try {
//			c = Class.forName(Message.class.getName());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		Method[] method = c.getDeclaredMethods();
//		for(Method m : method){
//			if(m.getName().startsWith("set")){
//				System.out.println(m.getName());
//			}
//		}

 //       return ms;
  //  }
}
