package test1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1 V1.1
 */
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 天気をランダムで決定
	    String[] weatherArray = { "晴れ", "曇り", "雨です" };
	    int index = (int) (Math.random() * 3);
	    String weather = weatherArray[index];

	    // HTMLを出力
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>今日の天気</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<p>" +"今日の天気は「" + weather + "」です</p>");
	    out.println("</body>");
	    out.println("</html>");

	}



}
