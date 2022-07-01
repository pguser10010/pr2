package test0;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormTestServlet
 */
public class FormTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormTestServlet() {
        super();
        // TODO Auto-generated constructor stub  2nd
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


			  protected void doPost(HttpServletRequest request,

			      HttpServletResponse response)
			      throws ServletException, IOException {
			    // リクエストパラメータを取得
			    // nameは名前、genderは性別

			    request.setCharacterEncoding("UTF-8");
			    String name = request.getParameter("name");
			    String gender = request.getParameter("gender");

			    // リクエストパラメータをチェック

			    String errorMsg = ""; //エラーメッセージを用意
			    if (name == null || name.length() == 0) {
			      errorMsg += "名前が入力されていません<br>";
			    }

			    if (gender == null || gender.length() == 0) {
			      errorMsg += "性別が選択されていません<br>";
			    } else {

			      if (gender.equals("0")) {
			        gender = "男性";
			      }

			      else if (gender.equals("1")) {
			        gender = "女性";
			      }
			    }

			    // 表示するメッセージを設定
			    String ms = name + "さん（" + gender + "）を登録しました";
			    if (errorMsg.length() != 0) {
			      ms = errorMsg;

			    }

			    // HTMLを出力
			    response.setContentType("text/html; charset=UTF-8");
			    PrintWriter out = response.getWriter();
			    out.println("<!DOCTYPE html >");
			    out.println("<html>");
			    out.println("<head>");
			    out.println("<meta charset=\"UTF-8\">");
			    out.println("<title>ユーザー登録結果表示</title>");
			    out.println("</head>");
			    out.println("<body>");
			    out.println("<p>" + ms + "</p>");
			    out.println("</body>");
			    out.println("</html>");
			  }
}
