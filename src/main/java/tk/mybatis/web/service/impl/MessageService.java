package tk.mybatis.web.service.impl;

import tk.mybatis.web.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.web.mapper.MessageMapper;
import tk.mybatis.web.mapper.MessageReplyMapper;


import java.util.List;
import java.util.Map;

@Service
public class MessageService {
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
