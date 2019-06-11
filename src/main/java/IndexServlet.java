
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Alibaba Cloud Toolkit. http://www.aliyun.com/product/cloudtoolkit
 */
public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = -112210702214857712L;

	@Override
	public void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		//Demo：通过 Cloud Toolkit ，高效的将本地应用程序代码修改，部署到云上。
		writer.write("Deploy from alibaba cloud toolkit. 2019-10-24");
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		writer.write("<br>a/b=:"+TestUtils.divide(a,b));
		return;
	}
	@Override
	protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		return;
		
	}
}