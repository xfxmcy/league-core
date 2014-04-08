/**
 * LolBaseDaoImpl.java
 * com.xfxmcy.lol.dao.impl
 *
 * Function： implements of baseDao 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年3月26日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.dao.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xfxmcy.lol.dao.LolBaseDao;
import com.xfxmcy.lol.util.Constant;

/**
 * ClassName:LolBaseDaoImpl
 * Function: implements of baseDao
 * Reason:	 implements of baseDao
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年3月26日		下午3:21:55
 *
 * @see 	 
 */
@SuppressWarnings({"unchecked"})
@Repository
public class LolBaseDaoImpl<LOL> implements LolBaseDao<LOL> {
	
	/*sessionFactory*/
	@Inject
	SessionFactory sessionFactory ;
	/*logger*/
	private static final Logger logger = Logger
			.getLogger(LolBaseDaoImpl.class);
	/*session*/
	Session session = null;
	
	public Session getCurrentSession(){
		 session = sessionFactory.getCurrentSession();
		 return session;
	};
	
	@Override
	public LOL persistence(LOL lol) {
		logger.info("persistence" + Constant.SYS_CON_FORMATER + lol.toString() +Constant.SYS_CON_FORMATER);
		this.getCurrentSession().persist(lol);
		return lol;
	}

	@Override
	public LOL merge(LOL lol) {
		logger.info("merge" + Constant.SYS_CON_FORMATER + lol.toString() + Constant.SYS_CON_FORMATER);
		this.getCurrentSession().merge(lol);
		return lol;
	}

	@Override
	public LOL load(Class<LOL> lol,String id) {
		Object result = this.getCurrentSession().load(lol,id);
		logger.info(Constant.SYS_CON_FORMATER + lol.getClass().getSimpleName() + Constant.SYS_CON_FORMATER + id);
		if(null != result)
			return (LOL)result;
		return null;
	}

	@Override
	public LOL delete(LOL lol) {
		logger.info("delete" + Constant.SYS_CON_FORMATER + lol.toString() + Constant.SYS_CON_FORMATER);
		this.getCurrentSession().delete(lol);
		return lol;
		
	}

	@Override
	public List<LOL> queryList(String hql , Map<String,Object> alias , Integer page , Integer rows) {
		Query query = this.createQueryAboutAlias(hql, alias);
		if(null != page && null != rows)
			this.setPaged(query , page , rows);
		return query.list();
	}
	/**
	 * 
	 * setPaged: query be paged
	 *
	 * @param query
	 * @param page
	 * @param rows
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年4月3日 		cy
	 */
	private void setPaged(Query query, Integer page, Integer rows) {
		query.setFirstResult((page - 1) * rows);
		query.setMaxResults(rows);
	}

	@Override
	public long queryCount(String hql , Map<String,Object> alias) {
		return (Long) this.createQueryAboutAlias(hql, alias).uniqueResult();
	}
	/**
	 * 
	 * createQueryAboutAlias: create query and set param through alias
	 *
	 * @param hql			  sql	
	 * @param alias			  alias
	 * @return				  query
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年4月3日 		cy
	 */
	public Query createQueryAboutAlias(String hql , Map<String,Object> alias){
		Query query = this.getCurrentSession().createQuery(hql);
		if(null != alias){
			for (Map.Entry<String, Object> mapEntry : alias.entrySet()) {
				query.setParameter(mapEntry.getKey(), mapEntry.getValue());
			}
		}
		return query;
	}
	
	
}

