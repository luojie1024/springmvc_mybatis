/**   
* @Title: ItemsService.java 
* @Package cn.itcast.ssm.service 
* @Description: TODO
* @author Jacky 550997728@qq.com   
* @date 2017年5月2日 下午8:29:20 
* @version V1.0   
*/
package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.mapper.ItemsMapperCustom;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

/** 
 * @ClassName: ItemsService 
 * @Description: TODO
 * @author Jacky 550997728@qq.com 
 * @date 2017年5月2日 下午8:29:20 
 *  
 */
public interface ItemsService{
	//查询商品信息
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
