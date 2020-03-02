import com.mybatis.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @auther：lcj
 * @date 2020/3/2 上午 10:38
 */
public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception{
        //读取配置文件
        String resource = "mybatis-config.xml";
        //构建一个输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据配置文件，构建sqlsessionfactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //构建会话,创建一个sqlsession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行映射文件中定义的sql语句，并返回映射的结果集
        Customer customer = sqlSession.selectOne("com.mybatis.mapper.CustomerMapper.findCustomerById",2);
        System.out.println(customer.toString());
        sqlSession.close();
    }
}
