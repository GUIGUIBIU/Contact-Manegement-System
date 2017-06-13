package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contract;
import service.database_operation;
import model.ConProcess;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class Sign
 */
@WebServlet("/Sign")
public class Sign extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Sign() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		this.doPost(request, response);
	  }
	
	
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
    	database_operation d_o=new database_operation();
		List<Contract> lists = new ArrayList<Contract>();
		String remark=request.getParameter("remark");//���
		String str_id=request.getParameter("con_id");//��ͬid
		String if_ok=request.getParameter("if_ok");//�Ƿ�ͨ��
		String searchwords=request.getParameter("searchwords");
		int if_pass=-1;
		if(if_ok!=null)
			if_pass= Integer.valueOf(if_ok).intValue();
		int id=-1;
		if(str_id!=null)
    	   id= Integer.valueOf(str_id).intValue();
        String flag=request.getParameter("flag");
        if(searchwords==null&&remark==null){
        	lists=d_o.select_contract_for_sign();
            request.setAttribute("lists", lists);//��lists�ŵ�������
        }else if(searchwords!=null&&remark==null){
        	lists=d_o.search_by_user(searchwords);
            request.setAttribute("lists", lists);//��lists�ŵ������� 
        }else if(remark!=null){
        	ConProcess cp= new ConProcess();
            cp.setConId(id);
            cp.setUserId(0);//////////��Ҫ�޸�
        	cp.setType(3);
        	cp.setState(1);
        	cp.setContent(remark);
        	cp.setDel(if_pass);
        	d_o.update_after_sign(cp);
        	lists=d_o.select_contract_for_sign();
            request.setAttribute("lists", lists);//��lists�ŵ�������
        }
        String curPage=request.getParameter("curPage");
		request.setAttribute("curpage", curPage);
        request.getRequestDispatcher("/contract_sign.jsp").forward(request, response);
        }

}
