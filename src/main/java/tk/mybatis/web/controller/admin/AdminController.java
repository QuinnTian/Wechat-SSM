package tk.mybatis.web.controller.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.web.mapper.TextMessageMapper;
import tk.mybatis.web.model.TextMessage;

import java.util.List;

@Controller
@RequestMapping("admin/")
public class AdminController {
    @Autowired
    private TextMessageMapper textMessageMapper;
    @RequestMapping(value ="testTextMessageLog")
    public String TextMessageShow(ModelMap m){
        List<TextMessage> textMessages = textMessageMapper.selectAll();
        m.put("textMessages",textMessages);
        return "test/testTextMessageLog";
    }
    @RequestMapping(value ="addTextMessage",method = RequestMethod.POST)
    public String addTextMessage(@RequestParam ("rule") String rule,
                                 @RequestParam ("keyword") String keyword,
                                 @RequestParam ("content") String content
                                 ){

        return "test/addTextMessage";
    }

}
