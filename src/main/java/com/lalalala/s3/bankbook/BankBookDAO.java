package com.lalalala.s3.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	public int setWrite(BankBookDTO bankbookDTO)throws Exception{
		//1. 로그인 정보 
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		//2. 클래스 로딩
		Class.forName(driver);

		//3. 로그인 Connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql ="insert into bankbook values(bank_seq.nextval,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankbookDTO.getBookName());
		st.setDouble(2, bankbookDTO.getBookRate());
		st.setString(3, bankbookDTO.getBookSale());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;

	}


	public BankBookDTO getSelect(BankBookDTO bankbookDTO) throws Exception {
		// 1. 
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 2. 
		Class.forName(driver);

		// 3. 
		Connection con = DriverManager.getConnection(url, user, password);

		// 4. 
		String sql = "SELECT * "
				+ "FROM BANKBOOK "
				+ "WHERE BOOKNUMBER = ?";

		// 5. 
		PreparedStatement st = con.prepareStatement(sql);

		// 6. 
		st.setLong(1, bankbookDTO.getBookNumber());

		// 7.
		ResultSet rs = st.executeQuery();

		if(rs.next()) {
			bankbookDTO = new BankBookDTO();
			bankbookDTO.setBookNumber(rs.getLong("bookNumber"));
			bankbookDTO.setBookName(rs.getString("bookName"));
			bankbookDTO.setBookRate(rs.getDouble("bookRate"));
			bankbookDTO.setBookSale(rs.getString("bookSale"));
		} else {
			bankbookDTO = null;
		}

		// 8. 
		rs.close();
		st.close();
		con.close();

		return bankbookDTO;

	}

	// getList
	// bankbook table의 모든 데이터 조회 후 리턴

	public List<BankBookDTO> getList() throws Exception {

		// 1. 
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 2. 
		Class.forName(driver);

		// 3. 
		Connection con = DriverManager.getConnection(url, user, password);

		// 4. 
		String sql = "select * from bankbook";

		// 5.
		PreparedStatement st = con.prepareStatement(sql);

		// 6.

		// 7. 
		ResultSet rs = st.executeQuery();

		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();

		while(rs.next()) {
			BankBookDTO bankbookDTO = new BankBookDTO();
			bankbookDTO.setBookNumber(rs.getLong("bookNumber"));
			bankbookDTO.setBookName(rs.getString("bookName"));
			bankbookDTO.setBookRate(rs.getDouble("bookRate"));
			bankbookDTO.setBookSale(rs.getString("bookSale"));

			ar.add(bankbookDTO);
		}

		// 8. 
		rs.close();
		st.close();
		con.close();

		return ar;

	}

}
