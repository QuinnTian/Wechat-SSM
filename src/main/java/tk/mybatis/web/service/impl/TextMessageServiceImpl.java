package tk.mybatis.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.web.mapper.KeywordMapper;
import tk.mybatis.web.mapper.TextMessageMapper;
import tk.mybatis.web.model.Keyword;
import tk.mybatis.web.model.TextMessage;

import java.util.List;

@Service
public class TextMessageServiceImpl {
    @Autowired
    private TextMessageMapper textMessageMapper;
    private KeywordMapper keywordMapper;
    public List<TextMessage> selectAll(){

        return textMessageMapper.selectAll();
    }
    public int insert(Keyword keyword,TextMessage textMessage){
        keywordMapper.insertKeyword(keyword);
        textMessage.setKeyId(keyword.getId());
        return textMessageMapper.insert(textMessage);
    }
}
