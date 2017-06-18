package dao;

import java.util.List;

import model.Role;
import util.AppException;

public interface RoleDao {

	/**
	 * ���ݽ�ɫid��ȡ��ɫ��Ϣ
	 * 
	 * @param int id 
	 * @return Role Role object
	 * @throws AppException
	 */
	public Role getById(int id) throws AppException;
	
	/**
	 * ��ѯ���н�ɫ
	 * 
	 * @return List<Role> Role object set
	 * @throws AppException
	 */
	public List<Role> getAll() throws AppException;
	
	/**
	 *��ӽ�ɫ
	 * 
	 * @param Role Role object
	 * @return Return true if added successfully,otherwise return false
	 * @throws AppException
	 */
	public boolean add(Role role) throws AppException;
	
	/**
	 *���½�ɫ
	 * 
	 * @param Role Role object
	 * @return Return true if updated successfully,otherwise return false
	 * @throws AppException
	 */
	public boolean update(Role role) throws AppException;
	
	/**
	 *ɾ����ɫ
	 * 
	 * @param int Role id
	 * @return Return true if deleted successfully,otherwise return false
	 * @throws AppException
	 */
	public boolean delete(int id) throws AppException;
}
