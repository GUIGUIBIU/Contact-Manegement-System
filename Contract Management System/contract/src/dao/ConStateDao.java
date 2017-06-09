package dao;
import util.AppException;

import java.util.List;

import model.ConState;

public interface ConStateDao {

	/**
	 * ��Ӻ�ͬ��Ϣ
	 * 
	 * @param  ��ͬ��Ϣ
	 * @return �Ƿ���ӳɹ�
	 * @throws AppException
	 */
	public boolean add(ConState conState) throws AppException;
	
	/**
	 *���ҷ������͵ĺ�ͬ
	 * @param ��ͬ����
	 * @return ��ͬ��Ϣ�ļ���
	 * @throws AppException
	 */
	public List<Integer> getConIdsByType(int type) throws AppException;
	
	/**
	 * ���Ҿ���id�����͵ĺ�ͬ
	 * @param ��ͬid
	 * @param ��ͬ����
	 * @return ��ͬ����
	 * @throws AppException
	 */
	public ConState getConState(int conId, int type) throws AppException;
	
	/**
	 * �жϺ�ͬ�Ƿ����
	 * 
	 * @param ��ͬid
	 * @param ��ͬ����
	 * @return �Ƿ����
	 * @throws AppException
	 */
	public boolean isExist(int con_id, int type) throws AppException;
	
}
