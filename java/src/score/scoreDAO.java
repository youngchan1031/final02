package score;
import java.sql.*;
import java.util.ArrayList;

import jdbc.OracleConnection;

public class scoreDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	//己利 涝仿
	public int scoreInsert(scoreDTO dto) {	 
		int result = 0;
		try {
			conn = OracleConnection.getConnection();
			String sql = "insert into score (name,studentnum,koreanscore,englishscore,mathscore) "
					+ "values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getStudentNum());
			pstmt.setInt(3, dto.getKoreanScore());
			pstmt.setInt(4, dto.getEnglishScore());
			pstmt.setInt(5, dto.getMathScore());
		
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(pstmt != null) try { pstmt.close(); }catch(SQLException e){}
			if(conn != null) try { conn.close(); }catch(SQLException e){} 
			}
		return result;
	}
	
	//己利 昏力
	public int 	scoreDelete (String studentNum) {
		int result = 0;
		try {
			conn = OracleConnection.getConnection();
			String sql = "delete from score where studentnum=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentNum);
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(pstmt != null) try { pstmt.close(); }catch(SQLException e){}
			if(conn != null) try { conn.close(); }catch(SQLException e){}
			}
		return result;
	}
	
	//己利 炼雀
		
		public ArrayList<scoreDTO> scoreRead(){
			ArrayList<scoreDTO> list = new ArrayList<scoreDTO>();
		try {
			conn = OracleConnection.getConnection();
			String sql = " select * from score";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				scoreDTO dto = new scoreDTO();
			  dto.setName(rs.getString("NAME"));
			  dto.setStudentNum(rs.getString("STUDENTNUM"));
			  dto.setKoreanScore(rs.getInt("KOREANSCORE"));
			  dto.setEnglishScore(rs.getInt("ENGLISHSCORE"));
			  dto.setMathScore(rs.getInt("MATHSCORE"));
			  list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if( rs != null ) {try { rs.close();}catch(SQLException e) {}}
			if( pstmt != null ) {try { pstmt.close();}catch(SQLException e) {}}
			if( conn != null ) {try { conn.close();}catch(SQLException e) {}}
		}
		return list;
	}
	
		
}
