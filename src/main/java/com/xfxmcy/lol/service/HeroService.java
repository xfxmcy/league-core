/**
 * HeroService.java
 * com.xfxmcy.lol.service
 *
 * Function： hero service 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月3日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.service;

import com.xfxmcy.lol.util.QueryParam;
import com.xfxmcy.lol.util.XfxmcyDataGrid;

/**
 * ClassName:HeroService
 * Function: hero service
 * Reason:	 hero service
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月3日		下午10:22:31
 *
 * @see 	 
 */
public interface HeroService {
	
	XfxmcyDataGrid doQueryHeros(QueryParam param);
}

