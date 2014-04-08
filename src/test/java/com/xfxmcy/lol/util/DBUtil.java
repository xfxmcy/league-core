/**
 * DBUtil.java
 * com.xfxmcy.lol.util
 *
 * Function： utilise of database 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年3月26日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName:DBUtil
 * Function: utilise of database
 * Reason:	 utilise of database
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年3月26日		下午4:03:51
 *
 * @see 	 
 */
public class DBUtil {
	/**
	 * 
	 * getConnection: getconnection
	 *
	 * @return
	 * @throws SQLException
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public static Connection getConnection() throws SQLException {
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xfxmcy", 
				"root", "123456");
		return con;
	}
	/**
	 * 
	 * close: close connection
	 *
	 * @param con
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public static void close(Connection con) {
		try {
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * close: close prepareStatement
	 *
	 * @param ps
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public static void close(PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * close: close resultSet
	 *
	 * @param rs
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public static void close(ResultSet rs) {
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

