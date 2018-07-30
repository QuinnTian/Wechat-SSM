package tk.mybatis.web.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import lombok.Getter;
import lombok.Setter;
@XStreamAlias("TextMessage")
public class TextMessage extends BaseMessage {
    @Getter
    @Setter
    @XStreamOmitField
    private Long bId;
    @Getter
    @Setter
    @XStreamAlias("MsgId")
    private Long msgId;
    @Getter
    @Setter
    @XStreamAlias("Content")
    private String content;
    @Getter
    @Setter
    @XStreamOmitField
    private int type;



}
