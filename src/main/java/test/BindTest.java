package test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.po.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/10 下午 16:50
 */
public class BindTest {
    @Test
    public void testBind(){
        /**
         * 接口应该定义为List,而不应该定义成Customer,模糊查询不止返回一条数据
         */
        MybatisUtil mybatisUtil=new MybatisUtil();
        SqlSession sqlSession=mybatisUtil.getsession();
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        Customer customer=new Customer();
        customer.setUsername("常");
       List<Customer> cu= customerMapper.bindSelect(customer);
        System.out.println(cu);
    }
}
