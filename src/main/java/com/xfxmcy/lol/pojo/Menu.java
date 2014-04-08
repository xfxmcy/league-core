/**
 * Menu.java
 * com.xfxmcy.lol.pojo
 *
 * Function： menu 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月5日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;



/**
 * ClassName:Menu
 * Function: menu 
 * Reason:	 menu
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月5日		下午9:12:15
 *
 * @see 	 
 */
@Entity
public class Menu  implements Serializable{
	
	private String url ;
	
	private String text ;
	
	private String id ;
	
	
	private Menu  menu;
	
	//private String leaf = "1";
	
	
	/*public String getLeaf() {
		return leaf;
	}
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}*/
	private Set<Menu>  menus;
	
	@ManyToOne
	@JoinColumn(name = "pid",nullable = true)
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	@OneToMany(fetch = FetchType.LAZY , mappedBy="menu")
	public Set<Menu> getMenus() {
		return menus;
	}
	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}
	
	public Menu() {

		// TODO Auto-generated constructor stub

	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Menu " + ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
	}
	
}

