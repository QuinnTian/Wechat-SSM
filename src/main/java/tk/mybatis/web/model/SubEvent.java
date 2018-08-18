package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;

public class SubEvent extends BaseMessage {
    @Getter
    @Setter
    private Long eId;
    @Getter
    @Setter
    private String event;
    @Getter
    @Setter
    private String eventKey;
    @Getter
    @Setter
    private  String ticket;
}
