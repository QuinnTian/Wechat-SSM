package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;

public class LocEvent extends BaseMessage{
    @Getter
    @Setter
    private Long lId;
    @Getter
    @Setter
    private String event;
    @Getter
    @Setter
    private String latitude;
    @Getter
    @Setter
    private String longitude;
    @Getter
    @Setter
    private String precision;
}
