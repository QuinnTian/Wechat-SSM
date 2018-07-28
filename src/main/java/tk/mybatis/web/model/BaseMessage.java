package tk.mybatis.web.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class BaseMessage {
    @Getter
    @Setter
    @XStreamAlias("ToUserName")
    public String toUserName;
    @Getter
    @Setter
    @XStreamAlias("FromUserName")
    public String fromUserName;
    @Getter
    @Setter
    @XStreamAlias("CreateTime")
    public Long createTime;
    @Getter
    @Setter
    @XStreamAlias("MsgType")
    public String msgType;


}
