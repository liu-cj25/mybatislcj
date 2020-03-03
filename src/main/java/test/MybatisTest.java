import com.mybatis.po.Customer;
import com.mybatis.po.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/2 上午 10:38
 */
public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception{
        MybatisUtil mybatisUtil=new MybatisUtil();
        //构建会话,创建一个sqlsession
        SqlSession sqlSession=mybatisUtil.getsession();
        //执行映射文件中定义的sql语句，并返回映射的结果集
        List<Customer> customer = sqlSession.selectList("com.mybatis.mapper.CustomerMapper.findCustomerById");
        System.out.println(customer.toString());
        sqlSession.close();
    }
}
