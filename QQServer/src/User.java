import java.io.Serializable;

/**
 * @author 张强
 * @version 1.0
 * 发送给客户端的用户类
 * 可序列化
 */
public class User implements Serializable {
    private final static long serialVersionID = 1L; // 序列化版本号，增加兼容性

    private String UserId;// 用户id
    private String Passwd;// 用户密码

    public User(String userId, String passwd) {
        UserId = userId;
        Passwd = passwd;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }
}
