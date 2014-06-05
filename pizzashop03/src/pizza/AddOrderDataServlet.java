package pizza;

import java.io.IOException;
import java.net.URL;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddOrderDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
    
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String[] kind = {"マルゲリータ（水牛のモッツｱレラチーズ・フレッシュバジリコ）","マリナーラ（アンチョビ・オレガノ・ニンニクオイル）","オルトラーナ（たっぷり野菜・パルミジャーノ）"};
        String[] size = new String[3];
        size[0] = req.getParameter("size1");
        size[1] = req.getParameter("size2");
        size[2] = req.getParameter("size3");
        int[] number = new int[3];
        number[0] = Integer.parseInt(req.getParameter("num1"));
        number[1] = Integer.parseInt(req.getParameter("num2"));
        number[2] = Integer.parseInt(req.getParameter("num3"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        Date date = Calendar.getInstance().getTime();
        OrderData[] data = new OrderData[3];
        for(int i=0; i<3; i++) {
        	data[i] = new OrderData(kind[i],size[i],number[i],name,address,date);
        }
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
        	for(int i=0; i<3; i++) {
        		manager.makePersistent(data[i]);
        	}
        } finally {
            manager.close();
        }
        resp.sendRedirect("/thanks.html");
    }
}
