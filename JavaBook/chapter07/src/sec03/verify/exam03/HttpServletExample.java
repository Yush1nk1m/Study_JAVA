package sec03.verify.exam03;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());				// login
		method(new FileDownloadServlet());		// download the file
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}