package com.manthan.resumefinder.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.manthan.resumefinder.bean.SearchDataBean;

public class SearchResumeDao {

	public static final String URL = "jdbc:mysql://localhost:3306/searchresume";
	public static final String USER = "root";
	public static final String PASS = "root";
	/**
	 * Get a connection to database
	 * @return Connection object
	 */
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PASS);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Error connecting to the database", ex);
		}
		return con;
	}

	public boolean insertsearchdata(SearchDataBean dataBean) {
		Connection connection = getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO searchcontent VALUES (?,?,?)");

			ps.setString(1,dataBean.getFilename());
			ps.setString(2,dataBean.getEmail());
			ps.setInt(3,2);
			ps.addBatch();

			ps.setString(1,dataBean.getFilename());
			ps.setString(2,dataBean.getMobile());
			ps.setInt(3,1);
			ps.addBatch();

			//for skill
			for(String skillname : dataBean.getSkill())
			{
				ps.setString(1,dataBean.getFilename());
				ps.setString(2,skillname);
				ps.setInt(3,0);
				ps.addBatch();

			}
			//for age
			if(null != dataBean.getExperience())
			{
				ps.setString(1,dataBean.getFilename());
				ps.setString(2,dataBean.getExperience().trim());
				ps.setInt(3,0);
				ps.addBatch();
			}


			int[] i = ps.executeBatch();
			if(i.length >= 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public Set<SearchDataBean> getFileNames(String searchstr) {

		Connection connection = getConnection();
		Set<String> data = new HashSet<String>();
		String qurst = "";
		try {
			List<String> searchquest = new ArrayList<String>(Arrays.asList(searchstr.split("\\s*[,]\\s*")));

			System.out.println(searchstr);
			String query = createQuery(searchquest.size());
			PreparedStatement ps = connection.prepareStatement(query);

			for(int i=1;i<=searchquest.size();i++)
			{
				ps.setString(i, searchquest.get(i-1));
			}
			ResultSet rs = ps.executeQuery();
			Set<SearchDataBean> files = new HashSet();
			SearchDataBean bean = new SearchDataBean();
			while(rs.next())
			{
				if(!data.contains(rs.getString(1)))
					bean = new SearchDataBean();
				bean.setFilename(rs.getString(1));
				if(rs.getInt(3) == 1)
					bean.setMobile(rs.getString(2));
				if(rs.getInt(3) == 2)
					bean.setEmail(rs.getString(2));
				files.add(bean);
				data.add(rs.getString(1));
			}
			return files;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	private  String createQuery(int length) {
		String query = "select file_name,search_Text,type from searchcontent where file_name in (select distinct file_name from searchcontent where search_Text in (";
		StringBuilder queryBuilder = new StringBuilder(query);
		for( int i = 0; i< length; i++){
			queryBuilder.append(" ?");
			if(i != length -1) queryBuilder.append(",");
		}
		queryBuilder.append(")) and type>0");
		return queryBuilder.toString();
	}
}
