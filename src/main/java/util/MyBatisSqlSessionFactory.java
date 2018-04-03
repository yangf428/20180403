package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.io.*;

import org.apache.ibatis.session.*;
public class MyBatisSqlSessionFactory
{
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory()
	{
		if(sqlSessionFactory == null)
		{
			InputStream inputStream;
			try
			{
				inputStream = Resources.
						getResourceAsStream("mybatis-config.xml");
				//加载mybatis的配置文件（它也加载关联的映射文件）
				sqlSessionFactory = new
						SqlSessionFactoryBuilder().build(inputStream);
				// 构建sqlSession的工厂

			}
			catch (IOException e)
			{
				throw new RuntimeException(e.getCause());
			}
		}
		return sqlSessionFactory;
	}
	public static SqlSession openSession()
	{
		return getSqlSessionFactory().openSession();
	}
}
/*MyBatis最关键的组成部分是SqlSessionFactory，创建。我们可以从中获取SqlSession，
		并执行映射的SQL语句。SqlSessionFactory对象可以通过基于XML的配置信息或者Java API */

/*上述的代码段中，我们创建了一个SqlSessionFactory对象，
我们将使用它来获得SqlSession对象和执行映射的SQL语句。*/