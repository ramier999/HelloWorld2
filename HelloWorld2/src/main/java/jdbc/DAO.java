package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO { // Data Access Object
	// << Singleton >>
	// 자기자신으로 만든 인스턴스
//	private static DAO dao = null;
	// 생성자
//	private DAO() {}
	// 인스턴스 사용
//	public static DAO getInstance() {
//		if(dao==null) {
//			return new DAO();
//		} else {
//		return new DAO();
//		}
//	}
	
	// Java <-> DB 연결시 사용
	protected Connection conn = null;
	// Select(조회) 결과 값 반환
	protected ResultSet rs = null;
	// Query문을 담고 Query문을 실행
	protected PreparedStatement pstmt = null;
	protected Statement stmt = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "test";
	String pw = "1234";
	
	public void conn() {
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			// 2. DB 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void disconnect() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
