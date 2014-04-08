/**
 * MenuServiceImpl.java
 * com.xfxmcy.lol.service.impl
 *
 * Function：  implement of menu 's service 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月5日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xfxmcy.lol.component.TreeNode;
import com.xfxmcy.lol.dao.LolBaseDao;
import com.xfxmcy.lol.pojo.Hero;
import com.xfxmcy.lol.pojo.Menu;
import com.xfxmcy.lol.service.MenuService;
import com.xfxmcy.lol.util.QueryParam;
import com.xfxmcy.lol.util.XfxmcyDataGrid;

/**
 * ClassName:MenuServiceImpl
 * Function: implement of menu 's service
 * Reason:	 implement of menu 's service
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月5日		下午3:08:43
 *
 * @see 	 
 */


@Transactional
@Service
public class MenuServiceImpl implements MenuService {
	
	@Inject
	LolBaseDao<Menu> lolBaseDaoImpl ;
	
	@Transactional(readOnly = true,propagation = Propagation.REQUIRED)
	@Override
	public List<TreeNode> constructedMenu(QueryParam param) {
		Map<String,Object> queryParam = null ;
		//String hql = "SELECT distinct m.id,m.text,m.url, CASE WHEN s.id IS NULL THEN '1' ELSE '0' end as leaf FROM Menu m LEFT JOIN Menu s ON m.id = s.pid" ;
		String hql = "from Menu";
		//XfxmcyDataGrid dataGrid = new XfxmcyDataGrid();
		if(null != param.getNode() && !"".equals(param.getNode()) &&  !"root".equals(param.getNode())){
			queryParam = new HashMap<String,Object>();
			queryParam.put("id", param.getNode());
			hql += " where pid = :id";
		}
		else 
			hql += " where pid is null";
		List<Menu> list = lolBaseDaoImpl.queryList(hql, queryParam, param.getPage(), param.getRow());
		/*if(null != list && 0 < list.size()){
			dataGrid.setRows(this.transformTreeNode(list));
		}*/	
		return this.transformTreeNode(list);
	}
	/**
	 * 
	 * transform:transform to list
	 *
	 * @param list
	 * @return
	 *   ver     date      		author
	 * ──────────────────────────────────
	 *   		 2014年4月7日 		cy
	 */
	private List<TreeNode> transformTreeNode(List<Menu> list) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		TreeNode treeNode = null ;
		for (Menu menu : list) {
			treeNode = new TreeNode();
			BeanUtils.copyProperties(menu, treeNode);
			if(null == menu.getMenus() || 0 == menu.getMenus().size())
				treeNode.setLeaf(true);
			//treeNode.se
			result.add(treeNode);
		}
		
		return result;
	}

}

