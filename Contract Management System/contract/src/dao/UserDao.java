package dao;

import java.util.List;

import model.User;
import util.AppException;

/**
 * @author Ǯ��
 * @date 2017��6��7�� ����9:28:57
 */
public interface UserDao {

	/**
	 * �����Ƿ���ͬ�����û�����
	 * @param name 	(�û���)
	 * @return ����True������û�����ͬ�����֣����򷵻�false
	 * @throws AppException
	 */
	public boolean isExist(String name) throws AppException;
	
	/**
	 * �����û���Ϣ
	 * @param user (user����ʵ��)
	 * @return ����True�����������û��ɹ������򷵻�false
	 * @throws AppException
	 */
	public boolean add(User user) throws AppException;
	/**
	 * Query  UserId according to user name and password
	 * @param name User name
	 * @param password 
	 * @throws AppException
	 */
	public int login(String name,String password) throws AppException;
	
	/**
	 * Query user's information according to id
	 * 
	 * @param id  User id
	 * @return User 
	 * @throws AppException
	 */
	public User getById(int id) throws AppException;
	
	/**
	 * Query user id set
	 * 
	 * @return User id set
	 * @throws AppException
	 */
	public List<Integer> getIds() throws AppException;
	public boolean update(User user) throws AppException;
	public boolean delete(User user) throws AppException;
	public int getUserCount() throws AppException;
}
