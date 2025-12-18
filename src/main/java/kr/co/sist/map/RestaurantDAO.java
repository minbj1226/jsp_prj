package kr.co.sist.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.board.BoardDTO;
import kr.sist.co.dao.DbConn;

public class RestaurantDAO {
	
	private static RestaurantDAO rDAO;
	
	private RestaurantDAO() {
		
	}
	
	public static RestaurantDAO getInstance() {
		if(rDAO==null) {
			rDAO=new RestaurantDAO();
		}//end if
		return rDAO;
	}//getInstance
	
	public List<RestaurantDTO> selectAllRestaurant(String id) throws SQLException {
		List<RestaurantDTO> list=new ArrayList<RestaurantDTO>();
		DbConn dbCon = DbConn.getInstance("jdbc/dbcp");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1.JNDI 사용 객체 생성
			// 2.DataSource 얻기
			// 3.Connection 얻기
			con = dbCon.getConn();
			// 4.쿼리문생성 객체 얻기
			StringBuilder selectRest = new StringBuilder();
			selectRest.append("	select rest_num, rest_name, menu, lat, lng, input_date	")
					.append("	from restaurant	")
					.append("	where id=?	");

			pstmt = con.prepareStatement(selectRest.toString());
			// 5.바인드 변수 값 설정
			pstmt.setString(1, id);
			// 6.조회 결과 얻기
			RestaurantDTO rDTO = null;

			rs = pstmt.executeQuery();
			while (rs.next()) {
				rDTO=new RestaurantDTO();
				
				rDTO.setRest_num(rs.getInt("rest_num"));
				rDTO.setRest_name(rs.getString("rest_name"));
				rDTO.setMenu(rs.getString("menu"));
				rDTO.setLat(rs.getDouble("lat"));
				rDTO.setLng(rs.getDouble("lng"));
				rDTO.setInput_date(rs.getDate("input_date"));
				
				list.add(rDTO);
			} // end while

		} finally {
			dbCon.dbClose(rs, pstmt, con);
		} // end finally
		
		return list;
	}//selectAllRestaurant
	
	public void insertRestaurant(RestaurantDTO rDTO) throws SQLException {
		DbConn dbCon = DbConn.getInstance("jdbc/dbcp");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = dbCon.getConn();
			String insertBoard = "insert into restaurant(rest_num, id, rest_name, menu, info, lat, lng) values( seq_board.nextval,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(insertBoard);
			pstmt.setString(1, rDTO.getId());
			pstmt.setString(2, rDTO.getRest_name());
			pstmt.setString(3, rDTO.getMenu());
			pstmt.setString(4, rDTO.getInfo());
			pstmt.setDouble(5, rDTO.getLat());
			pstmt.setDouble(6, rDTO.getLng());

			pstmt.executeUpdate();

		} finally {
			dbCon.dbClose(rs, pstmt, null);
		} // end finally
	}
}
