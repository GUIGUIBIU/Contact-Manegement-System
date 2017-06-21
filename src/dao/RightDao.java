package dao;

import java.util.List;

import model.Right;
import util.AppException;

/**
 * Permission Data Access Layer Interface
 */
public interface RightDao {

	/**
	 * �����û�id��ȡ��ɫid
	 * 
	 * @param userId
	 * @return roleId
	 * @throws AppException
	 */
	public int getRoleIdByUserId(int userId) throws AppException;

	/**
	 * ���ݽ�ɫid�����û�id
	 * 
	 * @param roleId
	 *            Role id
	 * @return User id set that meet the conditions; otherwise return null
	 * @throws AppException
	 */
	public List<Integer> getUserIdsByRoleId(int roleId) throws AppException;

	/**
	 * �����û�id��ȡpermission id
	 * 
	 * @param userId
	 *            User id
	 * @return id Permission id
	 * @throws AppException
	 */
	public int getIdByUserId(int userId) throws AppException;

	/**
	 * �����û�id��ȡ��ѯ�û�-��ɫ��ϵ
	 * 
	 * @param userId
	 *            User id
	 * @return id Permission id
	 * @throws AppException
	 */
	public Right getRightByUserId(int userId) throws AppException;

	/**
	 * �����û�-��ɫ��ϵ 
	 * 
	 * @param Right Right object
	 * @return boolean Return true if successful , otherwise false
	 * @throws AppException
	 */
	public boolean updateById(Right right) throws AppException;

	/**
	 * �������û�-��ɫ��ϵ
	 * 
	 * @param right
	 *            permission object
	 * @return Return true if successful , otherwise false
	 * @throws AppException
	 */
	public boolean add(Right right) throws AppException;

	/**
	 * ɾ���û�-��ɫ��ϵ
	 * 
	 * @param right
	 *            permission object
	 * @return Return true if successful , otherwise false
	 * @throws AppException
	 */
	public boolean delete(int userId) throws AppException;
}
