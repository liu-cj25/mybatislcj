package com.mybatis.po;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.security.PublicKey;

/**
 * @auther：lcj
 * @date 2020/3/3 下午 15:49
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    /**
     * 初始化sqlsessionfactory
     */
    static {
        try {
            //读取配置文件
            String resource = "mybatis-config.xml";
            //构建一个输入流
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //根据配置文件，构建sqlsessionfactory
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //获取sqlsession对象的静态方法
    public static SqlSession getsession(){
        return sqlSessionFactory.openSession();
    }
}
