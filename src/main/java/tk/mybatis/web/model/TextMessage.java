package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;

public class TextMessage extends BaseMessage {

    @Getter
    @Setter
    private Long MsgId;
    @Getter
    @Setter
    private String Content;


    @Override
    public String toString() {
        return "TextMessage{" +
                "MsgId=" + MsgId +
                ", Content='" + Content + '\'' +
                ", ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime=" + CreateTime +
                ", MsgType='" + MsgType + '\'' +
                '}';
    }
}
