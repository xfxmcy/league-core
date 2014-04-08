/**
 * MenuController.java
 * com.xfxmcy.lol.controller
 *
 * Function：  menu 's controller 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月5日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xfxmcy.lol.component.TreeNode;
import com.xfxmcy.lol.service.MenuService;
import com.xfxmcy.lol.util.Constant;
import com.xfxmcy.lol.util.QueryParam;


/**
 * ClassName:MenuController
 * Function: menu 's controller
 * Reason:	 menu 's controller
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月5日		下午2:59:33
 *
 * @see 	 
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MenuController.class);
	
	@Inject
	private MenuService menuServiceImpl;
	
	/*@ResponseBody
	public XfxmcyDataGrid construedMemu(QueryParam param , XfxmcyDataGrid dataGrid){
		
		return dataGrid;
	};*/
	@RequestMapping("/managerment/{path}")
	public String systemicPageTransforming(@PathVariable String path) {
		String returnPath = "/index";
		/*enter managing page*/
		if("host".equals(path)){
			returnPath = Constant.SystemicPage.SPOUSE_INDEX;
			logger.trace("sb systemicPageTransforming");
		}
		return returnPath;
	}
	
	
	@RequestMapping("/constructed")
	@ResponseBody
	public List<TreeNode> constructedMenu(QueryParam param ,HttpServletRequest request) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		result = menuServiceImpl.constructedMenu(param);
		
		/*result*/
		logger.trace("datagrid length" + result.size());
		return result;
	}
}

