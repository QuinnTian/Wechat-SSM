package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class BaseMessage {
    @Getter
    @Setter
    public String ToUserName;
    @Getter
    @Setter
    public String FromUserName;
    @Getter
    @Setter
    public Long CreateTime;
    @Getter
    @Setter
    public String MsgType;

    @Override
    public String toString() {
        return "BaseMessage{" +
                "ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime=" + CreateTime +
                ", MsgType='" + MsgType + '\'' +
                '}';
    }
}
