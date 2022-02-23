import java.io.Serializable;

/**
 * @author 张强
 * @version 1.0
 * 发送的信息对象
 */
public class Message implements Serializable {

    private String sender;// 发送者
    private String getter; // 接受者
    private String content; // 发送内容
    private String sendTime; // 发送时间
    private String mesType; // 消息类型(在接口中定义已知的消息类型)

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }
}
