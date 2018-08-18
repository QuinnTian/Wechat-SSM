package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MenuEvent extends BaseMessage {
    @Getter
    @Setter
    private Long mId;
    @Getter
    @Setter
    private String event;
    @Getter
    @Setter
    private String eventKey;
}
