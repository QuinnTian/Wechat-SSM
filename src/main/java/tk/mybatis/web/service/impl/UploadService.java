package tk.mybatis.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.web.model.Message;
import tk.mybatis.web.util.fileutil.ReadExcel;

import java.util.List;

@Service
public class UploadService {
    static int flag=1;
    @Autowired
    private MessageService MessageService;
    //批量导入客户
    public boolean batchImport(String name,MultipartFile file){
        boolean b = false;
        //创建处理EXCEL
        ReadExcel readExcel=new ReadExcel();
        //解析excel，获取客户信息集合。
        List<Message> customerList = readExcel.getExcelInfo(name ,file);
        System.out.println(customerList);
        if(customerList != null){
            b = true;
            flag=1;
            MessageService.saveMore(customerList);
        }

        //迭代添加客户信息（注：实际上这里也可以直接将customerList集合作为参数，在Mybatis的相应映射文件中使用foreach标签进行批量添加。）
//        for(Message customer:customerList){
//            System.out.println(customer.toString());
//
//        }
        return b;
    }

}
