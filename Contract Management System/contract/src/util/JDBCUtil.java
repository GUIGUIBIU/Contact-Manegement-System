package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ǯ��
 * @date 2017��6��4�� ����10:29:31
 */
public class JDBCUtil {

	//ʵ�����ݿ�contractdb������
	//���ݿ������ַ����������ַ����뷽ʽΪutf-8
	private static String url = "jdbc:mysql://localhost:3306/contractdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	//���ݿ��˻�
	private static String user = "root";
	//���ݿ�����
	private static String password = "123456";
	//��̬����飬��������driver,ֻ�ڼ��ظ����ʱ��ִ��һ��
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ���ݿ����ӣ�ÿ����һ�θ÷����ʹ���һ��������
	 * @return ����ɹ��������ӣ��򷵻�����ʵ����󣬷��򷵻�null
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connect success!");
		}catch (SQLException e){
			e.printStackTrace();
		}
		return conn;
		
	}
	
	/**
	 * �ر����ݿ�����
	 * @param ���ݿ����Ӷ���
	 * @return 
	 */
	public static void closeConnection(Connection conn){
		try{
			if((conn != null) && (!conn.isClosed())){
				conn.close();
				conn = null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * �ر����ݿ��ѯ����
	 * @param statement������
	 */
	public static void CloseStatement(Statement st){
		try{
			if((st != null) && (!st.isClosed())){
				st.close();
				st = null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * �ر����ݿ��ѯ����
	 * @param Preparedstatement������
	 */
	public static void ClosePreparedStatement(PreparedStatement st){
		try{
			if((st != null) && (!st.isClosed())){
				st.close();
				st = null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * �ر����ݿ��ѯ���
	 * 
	 * @param ResultSet��ѯ�������
	 */
	public static void closeResultSet(ResultSet rs) {
		try {
			if ((rs != null) && (!rs.isClosed())) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getConnection();
	}

}