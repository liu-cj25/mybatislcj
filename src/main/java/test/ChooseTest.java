package test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.po.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/8 下午 16:18
 */
public class ChooseTest {
    @Test
    public void ChooseTestDemo(){
        MybatisUtil mybatisUtil=new MybatisUtil();
        SqlSession sqlSession=mybatisUtil.getsession();
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        Customer customer=new Customer();
//        customer.setJobs("程序员");
//        customer.setUsername("常");
        List<Customer> list=customerMapper.ChooseSelect(customer);
        System.out.println(list);
        sqlSession.close();
    }
}
