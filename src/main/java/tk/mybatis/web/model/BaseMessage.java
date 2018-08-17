package tk.mybatis.web.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class BaseMessage {
    /**
     *
     */
    @Getter
    @Setter
    @XStreamOmitField
    private Long id;
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
    @Getter
    @Setter
    @XStreamAlias("MsgId")
    public Long msgId;

}
