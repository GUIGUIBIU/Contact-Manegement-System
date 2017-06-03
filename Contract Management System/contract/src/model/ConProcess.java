package model;

import java.util.Date;

/**
 *��ͬ�������ʵ����
 */
public class ConProcess {

	private int id;			    //ID
	private int conId;			// ��ͬid
	private int userId;			// �û� id
	private int type;			// ���ڽ��еĹ���(1-��ǩ ,2-��׼,3-ǩ�ɹ�)
	private int state;			// ����״̬(0-δ���,1-���,2-�˻�)
	private String content;		// ��������
	private Date time;			// ����ʱ��
	private int del;			// �Ƿ�ɾ����0û��ɾ����1ɾ��
	
	//Ĭ�Ϲ��캯����ʼ��
	public ConProcess(){
		this.id = 0;
		this.conId = 0;
		this.userId = 0;
		this.type = 0;
		this.state = 0;
		this.content = "";
		this.time = new Date();
		this.del = 0;
	}

	//������Ա������get��set����
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
}

