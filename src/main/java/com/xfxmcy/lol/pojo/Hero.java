/**
 * Hero.java
 * com.xfxmcy.lol.pojo
 *
 * Function： the  hero
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年3月26日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClassName:Hero
 * Function: the  hero
 * Reason:	 the  hero
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年3月26日		下午4:24:23
 *
 * @see 	 
 */
@Entity
public class Hero implements Serializable{
	
	
	private static final long serialVersionUID = -4148233952826733130L;

	public Hero() {
		
	}
	
	private String id;
	
	private String hname;
	
	private String nickname;
	
	private Date birthday;
	
	private float price ;
	
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Temporal(TemporalType.DATE)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	@OneToMany(mappedBy = "hero" ,fetch = FetchType.LAZY)	
	public Set<Derma> getDermaList() {
		return dermaList;
	}

	public void setDermaList(Set<Derma> dermaList) {
		this.dermaList = dermaList;
	}
	private Set<Derma> dermaList;
	
}

