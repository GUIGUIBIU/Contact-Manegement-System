package dao;

import java.util.List;

import model.Role;
import util.AppException;

public interface RoleDao {

	/**
	 * 根据id查询角色信息
	 * 
	 * @param int id 
	 * @return Role Role object
	 * @throws AppException
	 */
	public Role getById(int id) throws AppException;
	
	/**
	 * 查询所有角色对象的集合
	 * 
	 * @return List<Role> Role object set
	 * @throws AppException
	 */
	public List<Role> getAll() throws AppException;
	
	/**
	 *添加一个角色
	 * 
	 * @param Role Role object
	 * @return Return true if added successfully,otherwise return false
	 * @throws AppException
	 */
	public boolean add(Role role) throws AppException;
	
	/**
	 *更新一个角色
	 * 
	 * @param Role Role object
	 * @return Return true if updated successfully,otherwise return false
	 * @throws AppException
	 */
	public boolean update(Role role) throws AppException;
	
	/**
	 *删除一个角色
	 * 
	 * @param int Role id
	 * @return Return true if deleted successfully,otherwise return false
	 * @throws AppException
	 */
	public boolean delete(int id) throws AppException;
}
