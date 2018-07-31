package tk.mybatis.web.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.web.mapper.DictMapper;
import tk.mybatis.web.model.SysDict;
import tk.mybatis.web.service.DictService;

import java.util.List;

/**
* @program: $PROJECT_NAME
* @description: $description
* @author: Quinn Tian
* @create: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
**/
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public SysDict findById(Long id) {
        return dictMapper.selectByPrimaryKey(id);
    }

    public List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit) {
        RowBounds rowBounds = RowBounds.DEFAULT;
        if(offset != null && limit != null){
            rowBounds = new RowBounds(offset, limit);
        }
        return dictMapper.selectBySysDict(sysDict, rowBounds);
    }

    @Override
    public boolean saveOrUpdate(SysDict sysDict) {
        /** 
         * @Description: 方法描述 
         * @Param:  * @param sysDict 
         * @return: boolean 
         * @Author: Mr.Wang 
         * @Date: 2018/7/31 0:01
        **/ 
        if(sysDict.getId() == null){
            return dictMapper.insert(sysDict) == 1;
        } else {
            return dictMapper.updateById(sysDict) == 1;
        }
    }

    @Override
    public boolean deleteById(Long id) {
    	if(id == null){
    		throw new NullPointerException("id");
    	}
        return dictMapper.deleteById(id) == 1;
    }
}
