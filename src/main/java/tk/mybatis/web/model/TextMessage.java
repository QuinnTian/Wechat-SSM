package tk.mybatis.web.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;
@XStreamAlias("TextMessage")
public class TextMessage extends BaseMessage {

    @Getter
    @Setter
    @XStreamAlias("MsgId")
    private Long msgId;
    @Getter
    @Setter
    @XStreamAlias("Content")
    private String content;



}
