package beans;

import java.util.List;

public interface IHibernateDAO<T>  {
    boolean create(T entity);

    T read(int id);

    T read(String parameter1, String parameter2);

    boolean update(T entity);

    boolean delete(T entity);

    List<T> getAll();
}
