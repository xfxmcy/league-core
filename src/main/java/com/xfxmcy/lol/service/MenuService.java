/**
 * MenuService.java
 * com.xfxmcy.lol.service
 *
 * Function： menu 's service 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月5日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.service;

import java.util.List;

import com.xfxmcy.lol.component.TreeNode;
import com.xfxmcy.lol.util.QueryParam;
import com.xfxmcy.lol.util.XfxmcyDataGrid;

/**
 * ClassName:MenuService
 * Function: menu 's service
 * Reason:	 menu 's service
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月5日		下午3:04:25
 *
 * @see 	 
 */
public interface MenuService {
	/**
	 * 
	 * constructedMenu: constructed tree
	 *
	 * @param param
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年4月7日 		cy
	 */
	List<TreeNode> constructedMenu(QueryParam param);
}

