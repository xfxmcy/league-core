/**
 * Derma.java
 * com.xfxmcy.lol.pojo
 *
 * Function： derma entity 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年3月26日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * ClassName:Derma
 * Function: derma entity
 * Reason:	 derma entity
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年3月26日		下午4:32:14
 *
 * @see 	 
 */
@Entity
public class Derma {
	
	public Derma() {

	}
	
	private String id;
	
	private String name ;
	
	private Hero hero;
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@ManyToOne(optional = false)
	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
}

