/**
 * HeroServiceImpl.java
 * com.xfxmcy.lol.service.impl
 *
 * Function： implements heroService 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月3日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xfxmcy.lol.dao.LolBaseDao;
import com.xfxmcy.lol.pojo.Hero;
import com.xfxmcy.lol.service.HeroService;
import com.xfxmcy.lol.util.QueryParam;
import com.xfxmcy.lol.util.XfxmcyDataGrid;

/**
 * ClassName:HeroServiceImpl
 * Function: implements heroService
 * Reason:	 implements heroService
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月3日		下午10:27:20
 *
 * @see 	 
 */
@Transactional
@Service
public class HeroServiceImpl implements HeroService {
	@Inject
	LolBaseDao<Hero> lolBaseDaoImpl ;
	
	@Override
	public XfxmcyDataGrid doQueryHeros(QueryParam param) {
		//lolBaseDaoImpl.
		
		return null;

	}

}

