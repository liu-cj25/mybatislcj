package test;

import com.mybatis.mapper.UserMapper;
import com.mybatis.po.MybatisUtil;
import com.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @auther：lcj
 * @date 2020/3/12 下午 15:40
 */
public class CollectionTest {
    @Test
    public void collectionTestDemo(){
        MybatisUtil mybatisUtil=new MybatisUtil();
        SqlSession sqlSession=mybatisUtil.getsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.findUserWithOrder(2);
        System.out.println(user);
        sqlSession.close();
    }
}
