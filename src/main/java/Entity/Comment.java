package Entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public class Comment {
    private String id;
    private String context;
    private Date time;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    //@Override是伪代码，所以是可写可不写的．它表示方法重写，写上会给我们带来好处
    public String toString(){
        return "Comment{"+
                ",id="+id+
                ",context="+context+
                ",time="+time+
                ",user="+user+
                "}";
    }
}
