package test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.po.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/8 上午 11:20
 * 使用if的动态sql语句实现查询
 */
public class IfSelectTest {
    /**
     * 测试mybatis的if标签
     */
    @Test
    public void IfSelectBtName(){
        MybatisUtil mybatisUtil=new MybatisUtil();
        SqlSession sqlSession=mybatisUtil.getsession();
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        Customer customer=new Customer();
        customer.setUsername("常");
        customer.setJobs("程序员");
        List<Customer> list=customerMapper.IfSelectByName(customer);
        for (Customer cu:list) {
            System.out.println(cu.toString());
        }

        sqlSession.close();
    }
}
