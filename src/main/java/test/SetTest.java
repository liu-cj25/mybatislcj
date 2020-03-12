package test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.po.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @auther：lcj
 * @date 2020/3/10 上午 11:15
 */
public class SetTest {
    @Test
    public void SetTestDemo(){
        MybatisUtil mybatisUtil=new MybatisUtil();
        SqlSession sqlSession=mybatisUtil.getsession();
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        Customer customer=new Customer();
//        customer.setUsername("靓仔");
        customer.setJobs("公务员");
        customer.setId(1);
        customerMapper.UpdateCustomerSet(customer);
        sqlSession.commit();
        sqlSession.close();
    }
}
