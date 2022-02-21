package com.bryce.book.core.theSixthChapter.six_six.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author huff
 * @date 2020/3/25 15:43
 *
 * 使用enum枚举数据类型实现单例模式
 *
 * 在使用枚举类时，构造方法会被自动调用，也可以应用其这个特性实现单例设计模式
 */
public enum MyObject {
    connectionFactory;
    private Connection connection;
    private MyObject(){
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:sqlserver://localhost:1079;databaseName=ghydb";
            String username = "sa";
            String password = "";
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
