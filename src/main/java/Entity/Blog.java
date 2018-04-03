package Entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public class Blog {
    private String id;
    private String title;
    private String context;
    private Date date;
    private User author;
    private List<Comment> commentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    // setters and getters
    //重写toString方法
    @Override
    public String toString(){
        return "Blog{"+
                "id="+id+
                ",title="+title+
                ",context="+context+
                ",date="+date+
                ",author="+author+
                ",commentList="+commentList+
                "}"
                ;
    }

}
