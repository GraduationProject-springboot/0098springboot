package com.entity.view;

import com.entity.ShijianleixingtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事件类型统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:00:53
 */
@TableName("shijianleixingtongji")
public class ShijianleixingtongjiView  extends ShijianleixingtongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShijianleixingtongjiView(){
	}
 
 	public ShijianleixingtongjiView(ShijianleixingtongjiEntity shijianleixingtongjiEntity){
 	try {
			BeanUtils.copyProperties(this, shijianleixingtongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
