package com.ruoyi.system.service;

import com.ruoyi.system.domain.WxUserInfo;
import java.util.List;

/**
 * 微信公众号粉丝用户基本 服务层
 * 
 * @author ruoyi
 * @date 2019-03-26
 */
public interface IWxUserInfoService 
{
	/**
     * 查询微信公众号粉丝用户基本信息
     * 
     * @param id 微信公众号粉丝用户基本ID
     * @return 微信公众号粉丝用户基本信息
     */
	public WxUserInfo selectWxUserInfoById(Long id);
	
	/**
     * 查询微信公众号粉丝用户基本列表
     * 
     * @param wxUserInfo 微信公众号粉丝用户基本信息
     * @return 微信公众号粉丝用户基本集合
     */
	public List<WxUserInfo> selectWxUserInfoList(WxUserInfo wxUserInfo);
	
	/**
     * 新增微信公众号粉丝用户基本
     * 
     * @param wxUserInfo 微信公众号粉丝用户基本信息
     * @return 结果
     */
	public int insertWxUserInfo(WxUserInfo wxUserInfo);
	
	/**
     * 修改微信公众号粉丝用户基本
     * 
     * @param wxUserInfo 微信公众号粉丝用户基本信息
     * @return 结果
     */
	public int updateWxUserInfo(WxUserInfo wxUserInfo);
		
	/**
     * 删除微信公众号粉丝用户基本信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteWxUserInfoByIds(String ids);
	
}
