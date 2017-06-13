package dao;
import util.AppException;

import java.util.List;

import model.Contract;

public interface ContractDao {

	/**
	 * ��Ӻ�ͬ��Ϣ
	 * 
	 * @param  ��ͬ��Ϣ
	 * @return �Ƿ���ӳɹ�
	 * @throws AppException
	 */
	public boolean add(Contract contract) throws AppException;
	
	
	/**
	 * ���ҷ���id�ĺ�ͬ
	 * @param ��ͬid
	 * @return ��ͬ��Ϣ
	 * @throws AppException
	 */
	public Contract getById(int id) throws AppException;
	
	/**
	 * ���ҷ����û�id�ĺ�ͬ
	 * @param �û�id
	 * @return ���û����к�ͬid�ļ���
	 * @throws AppException
	 */
	public List<Integer> getIdsByUserId(int userId) throws AppException;
	
	/**
	 * �����û���ͬ��Ϣ
	 * @param �û�id
	 * @return �Ƿ�ɹ�
	 * @throws AppException
	 */
	public boolean updateById(Contract contract) throws AppException;
	public List<Integer> getIds() throws AppException;
}
