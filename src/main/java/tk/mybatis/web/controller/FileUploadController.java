package tk.mybatis.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.web.service.impl.UploadService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("addController/")
public class FileUploadController {

    private static Log log = LogFactory.getLog(FileUploadController.class);
    @Autowired
    private UploadService customerService;

    @RequestMapping(value = "batchimport", method = RequestMethod.POST)
    public String batchimport(@RequestParam(value="filename") MultipartFile file,
                              HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        log.info("AddController ..batchimport() start");
        //判断文件是否为空
        if(file==null) return null;
        //获取文件名
        String name=file.getOriginalFilename();
        //进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）
        long size=file.getSize();
        if(name==null || ("").equals(name) && size==0) return null;

        //批量导入。参数：文件名，文件。
        boolean b = customerService.batchImport(name,file);
        if(b){
            String Msg ="导入成功";
            request.getSession().setAttribute("msg",Msg);
        }else{
            String Msg ="import failed！";
            request.getSession().setAttribute("msg",Msg);
        }
        log.info(request.getSession().getAttribute("msg"));
        return "addfile";
    }

}