package tk.mybatis.web.controller;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.web.service.impl.MessageService;
import tk.mybatis.web.util.CheckUtil;
import tk.mybatis.web.util.MessageUtil;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
/**
 * @classname: WechatController
 * @description: 与微信服务端进行对接
 * @author: Quinn Tian
 * @create:  2018/7/31
**/
@Controller
public class WechatController {
    @Autowired
    private MessageService MessageService;

    /**
     * @Description: 通过get与微信服务端接口进行对接
     * @Param: [req, resp]
     * @return: void
     * @Author: Mr.Wang
     * @Date: 2018/7/31 1:00
     **/
    @RequestMapping(value = "/wx.do",method = RequestMethod.GET)
    @ResponseBody
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        String signature = req.getParameter("signature");
        System.out.println("signature:"+signature);
        String timestamp = req.getParameter("timestamp");
        System.out.println("timestamp:"+timestamp);
        String nonce = req.getParameter("nonce");
        System.out.println("nonce:"+nonce);
        String echostr = req.getParameter("echostr");
        System.out.println("echostr:"+echostr);
        PrintWriter out =resp.getWriter();
        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            System.out.println("验证成功");
            System.err.println("验证成功");
            out.println(echostr);//输出流
        }else {
            System.out.println("验证失败");
        }
    }
    /**
     * @Description: post执行具体逻辑
     * @Param: [req, resp]
     * @return: void
     * @Author: Quinn Tian
     * @Date: 2018/7/31 1:02
     **/
    @RequestMapping(value = "/wx.do",method = RequestMethod.POST)
    @ResponseBody
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, DocumentException {

        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        Map<String,String> map = MessageUtil.xmlToMap(req);
        System.out.println(req);
        String fromUserName = map.get("FromUserName");//发送方帐号（一个OpenID）
        System.out.println(fromUserName);
        String toUserName = map.get("ToUserName");//开发者微信号

        String createTime = map.get("CreateTime");//消息创建时间 （整型）
        System.out.println(createTime);
        String msgType = map.get("MsgType");//text
        System.err.println(msgType);
        String content = map.get("Content");//文本消息内容
        System.out.println(content);
        String msgId = map.get("MsgId");//消息id，64位整型
        MessageService.judgeType(map);
        /**
         * 所有接收到的信息收到的信息进行数据库存储
         * 表：message
         */
 //       MessageService.saveOne(map);
 //       Message m=MessageUtil.mapToMessage(map);
//        List<Message> ms = new ArrayList<Message>();
//        ms.add(m);
//        MessageService.saveMore(ms);
//        out.print(MessageService.messageJudge(map));


    }
}
