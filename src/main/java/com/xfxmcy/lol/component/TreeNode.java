/**
 * TreeNode.java
 * com.xfxmcy.lol.component
 *
 * Function： tree node 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月7日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.component;

import java.util.List;

/**
 * ClassName:TreeNode
 * Function: tree node
 * Reason:	 tree node
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月7日		下午10:11:02
 *
 * @see 	 
 */
public class TreeNode {
	
	public TreeNode() {

	}
	private String url ;
	
	private String id ;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	private String text ; 
	
	private boolean leaf = false;
	
	private boolean expanded;
	
	private List<TreeNode> children;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	   
}

