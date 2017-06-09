package dao;

import java.util.List;

import model.ConProcess;
import util.AppException;

/**
 * ��ͬ����
 */
public interface ConProcessDao {

	/**
	 * �жϺ�ͬid�Ƿ��Ѿ�����
	 * ���룺��ͬid
	 * ����true���ڣ�false ������
	 * @throws AppException
	 */
	public boolean isExist(int conId) throws AppException;
	
	/**
	 * ���һ����ͬ��Ϣ
	 * ����  ��ͬ������
	 * �����Ƿ�ɹ�
	 * @throws AppException
	 */
	public boolean add(ConProcess conProcess) throws AppException;
	
	/**
	 * �������з���������id
	 * ���룺conProcess
	 * ���أ�id����
	 * @throws AppException
	 */
	public List<Integer> getConIds(ConProcess conProcess) throws AppException;
	
	/**
	 * ����״̬
	 *���룺conProcess
	 *�����Ƿ���³ɹ�
	 * @throws AppException
	 */
	public boolean update(ConProcess conProcess) throws AppException;
	
	/**
	 *��ѯ����
	 * ����:conProcess
	 * ���أ�����
	 * @throws AppException
	 */
	public int getTotalCount(ConProcess conProcess) throws AppException;
	
	/**
	 * ��ѯ���������ĺ�ͬ����id
	 * 
	 * @param conId ��ͬ��
	 * @param type ��ͬ���� 
	 * @param ��ͬ״̬
	 * ���غ�ͬid����
	 * @throws AppException
	 */
	public List<Integer> getIds(int conId, int type, int state) throws AppException;
	
	/**
	 * ��ѯ��ͬ��Ϣ
	 * 
	 *���룺��ͬid
	 * ����contract process��
	 * @throws AppException
	 */
	public ConProcess getById(int id) throws AppException;
	
}
