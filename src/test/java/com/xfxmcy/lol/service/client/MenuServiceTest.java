/**
 * MenuServiceTest.java
 * com.xfxmcy.lol.service.client
 *
 * Function： test menu service 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2014年4月5日 		cy
 *
 * Copyright (c) 2014, xfxmcy All Rights Reserved.
*/

package com.xfxmcy.lol.service.client;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xfxmcy.lol.service.MenuService;
import com.xfxmcy.lol.util.QueryParam;
import com.xfxmcy.lol.util.XfxmcyDataGrid;

/**
 * ClassName:MenuServiceTest
 * Function: test menu service
 * Reason:	 test menu service
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014年4月5日		下午3:35:04
 *
 * @see 	 
 */
//@RunWith(SpringJUnit4ClassRunner.class)  // command instrument is been functioned
//@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-hibernate.xml"})
public class MenuServiceTest {
	
	@Inject
	private MenuService menuServiceImpl ;
	

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MenuServiceTest.class);
	
	/*@Test
	public void testConstructedMenu(){
		QueryParam param = new QueryParam();
		XfxmcyDataGrid datagrid = menuServiceImpl.constructedMenu(param);
		logger.debug(datagrid);
	}*/
	
}

