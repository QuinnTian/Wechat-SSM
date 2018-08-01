package tk.mybatis.web.service.impl;

import tk.mybatis.web.mapper.BaseMessageMapper;
import tk.mybatis.web.mapper.TextMessageMapper;
import tk.mybatis.web.model.BaseMessage;
import tk.mybatis.web.model.TextMessage;
import tk.mybatis.web.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;
/**
 * <p>The class of MessageService
 * @since 2018/7/31
 * @author Quinn Tian
 * @version 0.0.1
*/
@Service
public class MessageService {

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
    @Autowired
    private BaseMessageMapper baseMessageMapper;
    @Autowired

    private TextMessageMapper textMessageMapper;

    /**
     * The function is to judge the type of messages from wechat service.
     * <p>Create by Quinn Tian
     * <p>Last modified date  2018/7/31 10.50
     * @param map
     * @return java.lang.String
     * @since 2018/7/31 10:40
     */
    public  String judgeType(Map<String,String> map){

        if(map.get("MsgType").equals(MESSAGE_TEXT)){
            BaseMessage bs = MessageUtil.mapToBaseMessage(map);
            baseMessageMapper.insert(bs);
            TextMessage tx = MessageUtil.mapToTextMessage(map);
            tx.setBId(bs.getId());
            textMessageMapper.insert(tx);


        }
        return null;
    }
    public void replyMessage(Map<String,String> map){
        if(map.get("MsgType").equals(MESSAGE_TEXT)){
        List<TextMessage> txs = textMessageMapper.selectAll();
        for (TextMessage t : txs){
            if (map.get("content").equals(t.getContent())){

            }
        }
        }
    }

//    @Autowired
//    private  UploadService uploadService;
//    @Autowired
//    private MessageMapper messageMapper;
//    @Autowired
//    private MessageReplyMapper MessageReplyMapper;
//
//    /**
//     * 存储发送过来的任何类型信息
//     *
//     * @param
//     * @return
//     */
//    public Boolean saveOne(Map<String, String> m) {
//
//
//        return messageMapper.insertOne(MessageUtil.mapToMessage(m)) == 1;
//    }
//
//    /**
//     * 批量插入信息
//     *
//     * @param
//     * @return
//     */
//    public Boolean saveMore(List<Message> m) {
//        return MessageReplyMapper.insertMessageReply(m) != 0;
//    }
//
//    /**
//     * 查询message_reply 所有信息
//     *
//     * @return
//     */
//    public List<Message> queryAllReply() {
//        List<Message> mss = MessageReplyMapper.queryAllMessageReply();
//        System.out.println("-----------回复表所有信息----" + mss);
//
//        return mss;
//    }
//
//    /**
//     * @param map
//     * @return
//     */
//    public String messageJudge(Map<String, String> map) {
//        //将集合转为实体
//        String message = null;
//        Message ms = MessageUtil.mapToMessage(map);
//        //查询所有回复表中的信息
//        int flag=UploadService.flag;
//         List<Message> mss=null;
//        if (flag==1||mss==null){
//            mss = queryAllReply();
//            UploadService.flag=0;
//        }
//        if ("event".equals(ms.getMsgType())) {
//
//                message = MessageUtil.initText(ms.getToUserName(), ms.getFromUserName(), MessageUtil.menuText());
//
//        }else if (MessageUtil.MESSAGE_TEXT.equals(ms.getMsgType())) {
//            if ("help".equalsIgnoreCase(ms.getContent())) {
//                message = MessageUtil.initText(ms.getToUserName(),ms.getFromUserName(), MessageUtil.menuText());
//            }else{
//                message = MessageUtil.initText(ms.getToUserName(), ms.getFromUserName(), "无法识别,请输入其他内容...\n 或回复help");
//            }
//            for (Message m : mss) {
//                if (m.getKeyMessage().equalsIgnoreCase(ms.getContent())) {
//                    message = MessageUtil.initText(ms.getToUserName(), ms.getFromUserName(),m.getContent());
//                    break;
//                }
//            }
//
//
//
////            if ("1".equals(ms.getContent())) {
////                message = MessageUtil.initText(ms.getToUserName(), ms.getFromUserName(), MessageUtil.firstMenu());
////
////
////            }else if ("?".equals(ms.getContent())) {
////                message = MessageUtil.initText(ms.getToUserName(),ms.getFromUserName(), MessageUtil.menuText());
////            }
////        }else if (MessageUtil.MESSAGE_EVENT.equals(ms.getMsgType())) {
////            String eventType = map.get("Event");
////            //关注后处理方法
////            if (MessageUtil.MESSAGE_SUBSCRIBE.equals(eventType)) {
////                message = MessageUtil.initText(ms.getToUserName(), ms.getFromUserName(), MessageUtil.menuText());
////            }
//        }
//        System.out.println(message);
//        return message;
//    }
}
