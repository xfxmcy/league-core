package com.xfxmcy.lol.util;

import java.util.List;

import junit.framework.Assert;

import com.xfxmcy.lol.pojo.Hero;
/**
 * 
 * ClassName:EntitiesHelper
 * Function: entity helper
 * Reason:	 entity helper
 *
 * @author   cy
 * @version  
 * @since    Ver 1.1
 * @Date	 2014	2014年3月26日		下午4:21:24
 *
 * @see
 */
public class EntitiesHelper {
	private static Hero baseUser = new Hero();
	
	public static void assertUser(Hero expected,Hero actual) {
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getHname(), actual.getHname());
	}
	
	public static void assertUsers(List<Hero> expected,List<Hero> actuals) {
		for(int i=0;i<expected.size();i++) {
			Hero eu = expected.get(i);
			Hero au = actuals.get(i);
			assertUser(eu, au);
		}
	}
	
	public static void assertUser(Hero expected) {
		assertUser(expected, baseUser);
	}
}
