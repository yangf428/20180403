package mapper;

import Entity.Blog;

import java.util.List;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public interface BlogMapper {
    public boolean newBlog(Blog blog);
    public boolean delBlog(String id);
    public boolean updateBlog(Blog blog);
    public Blog queryBlogbyId(String id);
    public List<Blog> listAllBlog();
    public List<Blog> queryBlogByTitle(String title);
}
