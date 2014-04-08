/**
 * LolBaseDao.java
 * com.xfxmcy.lol.dao
 *
 * Function： basic operation for db 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年3月26日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.dao;

import java.util.List;
import java.util.Map;

/**
 * ClassName:LolBaseDao
 * Function: basic operation for db
 * Reason:	 basic operation for db
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年3月26日		下午3:02:02
 *
 * @see 	 
 */
public interface LolBaseDao<LOL> {
	/**
	 * 
	 * persistence:persistence lol
	 *
	 * @param lol
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public LOL persistence(LOL lol);
	/**
	 * 
	 * merge: merge lol
	 *
	 * @param lol
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public LOL merge(LOL lol); 
	/**
	 * 
	 * load: load lol by id
	 *
	 * @param id
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public LOL load(Class<LOL> lol,String id);
	/**
	 * 
	 * delete: delete object by id 
	 *
	 * @param id
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年3月26日 		cy
	 */
	public LOL delete(LOL lol);
	
	/**
	 * 
	 * queryList: query list
	 *
	 * @param hql hql
	 * @param param alias
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年4月3日 		cy
	 */
	public List<LOL> queryList(String hql , Map<String,Object> alias , Integer page , Integer rows);
	/**
	 * 
	 * queryCount: select count(*)
	 *
	 * @param hql
	 * @parma alias
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年4月3日 		cy
	 */
	public long queryCount(String hql , Map<String,Object> alias);
}

