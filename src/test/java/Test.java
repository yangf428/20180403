import java.util.*;
import org.junit.*;
import Entity.Blog;
import service.BlogService;

public class BlogServiceTest
{
	private static BlogService blogService;
	@BeforeClass
	public static void setup()
	{
		blogService = new BlogService();
	}
	@AfterClass
	public static void teardown()
	{
		blogService = null;
	}
	@Test
	public void testFindAllStudents()
	{
		List<Blog> blogs = blogService.listAllBlog();
		Assert.assertNotNull(blogs);
		for (Blog blog : blogs)
		{
			System.out.println(blog);
		}
	}
	@Test
	public void queryBlogById()
	{
		Blog blog = blogService.queryBlogById("1");
		Assert.assertNotNull(blog);
		System.out.println(blog);
	}
	@Test
	public void testCreateStudent()
	{
		Blog blog = new Blog();
		String id = "3";
		blog.setId(id);
		blog.setTitle("this is title");
		blog.setContext("this is context");
		blog.setDate(new Date());
		blog.setAuthor(null);
		Assert.assertNotNull("newBlog");
	}
}