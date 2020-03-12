package test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.po.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther：lcj
 * @date 2020/3/10 下午 13:18
 */
public class ForEachTest {
    MybatisUtil mybatisUtil=new MybatisUtil();
    SqlSession sqlSession=mybatisUtil.getsession();
    CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);

    /**
     * list的单参数的传入
     */
    @Test
    public void forEachListTest(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        List<Customer> list1=customerMapper.selectForEach(list);
        for(Customer cu:list1){
            System.out.println(cu.toString());
        }
    }

    /**
     * array的传入参数
     */
    @Test
    public void ArrayForEach(){
        int[] arr=new int[]{1,3};
        List<Customer> list1= customerMapper.ForEachArray(arr);
        for(Customer cu:list1){
            System.out.println(cu.toString());
        }
    }
    /**
     * map
     */
    @Test
    public void mapFor(){
        int[] arr=new int[]{1,5};
        Map<String,Object> map=new HashMap<String,Object>();
//        ids与collection的值对应
        map.put("ids",arr);
//        map.put("username","常江");
        List<Customer> list1= customerMapper.forEachMap(map);
        for(Customer cu:list1){
            System.out.println(cu.toString());
        }
    }
}
