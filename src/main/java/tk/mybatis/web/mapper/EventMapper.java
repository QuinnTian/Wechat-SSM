package tk.mybatis.web.mapper;

import tk.mybatis.web.model.LocEvent;
import tk.mybatis.web.model.MenuEvent;
import tk.mybatis.web.model.SubEvent;

public interface EventMapper {
    public int insertSub(SubEvent subEvent);
    public int insertLoc(LocEvent locEvent);
    public int insertMenuClick(MenuEvent menuEvent);
}
