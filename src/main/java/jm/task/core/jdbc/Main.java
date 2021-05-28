package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserService dao = new UserServiceImpl();

        dao.createUsersTable();

        dao.saveUser("Petr", "Petrov", (byte) 54);
        dao.saveUser("Ivan", "Ivanov", (byte) 34);
        dao.saveUser("Vasiliy", "Vasilev", (byte) 39);
        dao.saveUser("Alex", "Kozlov", (byte) 41);
        dao.removeUserById(3);

        dao.getAllUsers().forEach(System.out::println);

        dao.cleanUsersTable();
        dao.dropUsersTable();

    }


}
