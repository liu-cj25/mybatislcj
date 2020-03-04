import com.mybatis.mapper.CustomerMapper;
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
    MybatisUtil mybatisUtil=new MybatisUtil();
    //构建会话,创建一个sqlsession
    SqlSession sqlSession=mybatisUtil.getsession();

    /**
     * 根据id去查
     * @throws Exception
     */
    @Test
    public void findCustomerByIdTest() throws Exception{
        //执行映射文件中定义的sql语句，并返回映射的结果集
//        List<Customer> customer = sqlSession.selectList("com.mybatis.mapper.CustomerMapper.findCustomerById");
////        System.out.println(customer.toString());
////        sqlSession.close();

        //--------mapper的方式，接口
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        //查id
        Customer customer =new Customer();
        customer.setId("003");
        Customer customer1=customerMapper.findById(customer.getId());
        System.out.println(customer1);
        sqlSession.close();
    }

    /**
     * 查所有
     */
    @Test
    public void findAllCustomer(){
        //findall
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        List customer=customerMapper.findAll();
        System.out.println(customer);
        sqlSession.close();
    }
    /**
     * update
     */
    @Test
    public void updateTest(){
        CustomerMapper customerMapper =sqlSession.getMapper(CustomerMapper.class);
        Customer customer =new Customer();
        customer.setId("003");
        customer.setUsername("量子啊靓仔");
        int count=customerMapper.updateCustomerById(customer);
        if (count>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
    }
    /**
     * 删除
     */
    @Test
    public void deleteTest(){
        CustomerMapper customerMapper= sqlSession.getMapper(CustomerMapper.class);
        Customer customer=new Customer();
        customer.setId("002");
        int count=customerMapper.deleteCustomer(customer);
        sqlSession.commit();
        if (count>0){
            System.out.println("删除成功");
        }
    }
    /**
     * insert
     */
    @Test
    public void insertTest(){
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        Customer customer=new Customer();
        customer.setId("002");
        customer.setUsername("开开");
        customer.setJobs("程序员王牌");
        customer.setPhone("13046255571");
        int count=customerMapper.insertCustomer(customer);
        if (count>0){
            System.out.println("新增成功");
            sqlSession.commit();
        }else{
            System.out.println("新增失败");
        }

    }
}
