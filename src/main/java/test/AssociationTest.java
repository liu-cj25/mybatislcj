package test;

import com.mybatis.mapper.PersonMapper;
import com.mybatis.po.MybatisUtil;
import com.mybatis.po.Person;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @auther：lcj
 * @date 2020/3/11 下午 21:41
 */
public class AssociationTest {
    @Test
    public void personAssociation(){
        MybatisUtil mybatisUtil=new MybatisUtil();
        SqlSession sqlSession=mybatisUtil.getsession();
        PersonMapper personMapper=sqlSession.getMapper(PersonMapper.class);
        Person person=new Person();
        person.setPerson_id(2);
        Person person1=personMapper.findPersonByID(person);
        System.out.println(person1);
        System.out.println(person1.getIdCard().getCode());
    }
}
