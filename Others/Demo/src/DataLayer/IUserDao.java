package DataLayer;

import java.util.List;

public interface IUserDao<T>{
    void addNew(T obj) throws Exception;
    List<T> getList() throws Exception;        
}