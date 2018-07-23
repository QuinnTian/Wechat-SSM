package tk.mybatis.web.model;

import lombok.Getter;
import lombok.Setter;

public class Message extends BaseMessage {

    @Getter
    @Setter
    private String Content;
    @Getter
    @Setter
    private Long MsgId;
    @Getter
    @Setter
    private String PicUrl;
    @Getter
    @Setter
    private String MediaId;
    @Getter
    @Setter
    private String Format;
    @Getter
    @Setter
    private String Recognition;
    @Getter
    @Setter
    private String ThumbMediaId;
    @Getter
    @Setter
    private String LocationX;
    @Getter
    @Setter
    private String LocationY;
    @Getter
    @Setter
    private String Scale;
    @Getter
    @Setter
    private String Label;
    @Getter
    @Setter
    private String Title;
    @Getter
    @Setter
    private String Description;
    @Getter
    @Setter
    private String Url;
    @Getter
    @Setter
    private String KeyMessage;

    @Override
    public String toString() {
        return "Message{" +
                "Content='" + Content + '\'' +
                ", MsgId=" + MsgId +
                ", PicUrl='" + PicUrl + '\'' +
                ", MediaId='" + MediaId + '\'' +
                ", Format='" + Format + '\'' +
                ", Recognition='" + Recognition + '\'' +
                ", ThumbMediaId='" + ThumbMediaId + '\'' +
                ", LocationX='" + LocationX + '\'' +
                ", LocationY='" + LocationY + '\'' +
                ", Scale='" + Scale + '\'' +
                ", Label='" + Label + '\'' +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", Url='" + Url + '\'' +
                ", KeyMessage='" + KeyMessage + '\'' +
                ", ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime=" + CreateTime +
                ", MsgType='" + MsgType + '\'' +
                '}';
    }
}
