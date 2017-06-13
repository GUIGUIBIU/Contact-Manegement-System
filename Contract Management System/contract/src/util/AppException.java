package util;

/**
 * �û������Exception��
 * 
 * @author Ǯ��
 * @date 2017��6��6�� ����3:48:32
 */
public class AppException extends Exception {
	private int exceptionCode; // �쳣����
	private String message; // �쳣��Ϣ

	/**
	 * ���캯���������쳣��Ϣ
	 * 
	 * @param message
	 */
	public AppException(String message) {
		this.message = message;
	}

	/**
	 * ���캯���������쳣��Ϣ���쳣����
	 * 
	 * @param message
	 * @param exceptionCode
	 */
	public AppException(String message, int exceptionCode) {
		this.message = message;
		this.exceptionCode = exceptionCode;
	}

	/**
	 * ��ȡ�쳣����
	 * 
	 * @return exceptionCode
	 */
	public int getExceptionCode() {
		return exceptionCode;
	}

	/**
	 * ��ȡ��ϸ�쳣��Ϣ
	 * 
	 * @return detailMessage
	 */
	public String getMessage() {
		String detailMessage = "Detail Message:" + exceptionCode + " " + message;
		return detailMessage;
	}

}
