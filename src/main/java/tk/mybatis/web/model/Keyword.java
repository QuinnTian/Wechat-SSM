package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;

public class Keyword {
    @Getter
    @Setter
    Long id;
    @Getter
    @Setter
    String keyword;
    @Getter
    @Setter
    String keyrule;
}
