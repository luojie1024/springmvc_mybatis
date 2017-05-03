package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.ItemsMapperCustom;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;

/** 
 * @ClassName: ItemsServiceIml 
 * @Description: TODO
 * @author Jacky 550997728@qq.com 
 * @date 2017年5月2日 下午7:23:50 
 *  
 */
public class ItemsServiceImpl implements ItemsService{
	//注入mapper
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	//商品查询列表
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception{
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}
}
