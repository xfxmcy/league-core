/**
 * QueryParam.java
 * com.xfxmcy.lol.util
 *
 * Function： query param 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月3日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.util;
/**
 * ClassName:QueryParam
 * Function: query param
 * Reason:	 query param
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月3日		下午10:26:17
 *
 * @see 	 
 */
public class QueryParam {
	
	private Integer page,row;

	private String id;
	
	private String node;
	
	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public QueryParam() {

		// TODO Auto-generated constructor stub

	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}
	
}

