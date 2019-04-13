package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WxUserInfoMapper;
import com.ruoyi.system.domain.WxUserInfo;
import com.ruoyi.system.service.IWxUserInfoService;
import com.ruoyi.common.support.Convert;

/**
 * 微信公众号粉丝用户基本 服务层实现
 * 
 * @author ruoyi
 * @date 2019-03-26
 */
@Service
public class WxUserInfoServiceImpl implements IWxUserInfoService 
{
	@Autowired
	private WxUserInfoMapper wxUserInfoMapper;

	/**
     * 查询微信公众号粉丝用户基本信息
     * 
     * @param id 微信公众号粉丝用户基本ID
     * @return 微信公众号粉丝用户基本信息
     */
    @Override
	public WxUserInfo selectWxUserInfoById(Long id)
	{
	    return wxUserInfoMapper.selectWxUserInfoById(id);
	}
	
	/**
     * 查询微信公众号粉丝用户基本列表
     * 
     * @param wxUserInfo 微信公众号粉丝用户基本信息
     * @return 微信公众号粉丝用户基本集合
     */
	@Override
	public List<WxUserInfo> selectWxUserInfoList(WxUserInfo wxUserInfo)
	{
	    return wxUserInfoMapper.selectWxUserInfoList(wxUserInfo);
	}
	
    /**
     * 新增微信公众号粉丝用户基本
     * 
     * @param wxUserInfo 微信公众号粉丝用户基本信息
     * @return 结果
     */
	@Override
	public int insertWxUserInfo(WxUserInfo wxUserInfo)
	{
	    return wxUserInfoMapper.insertWxUserInfo(wxUserInfo);
	}
	
	/**
     * 修改微信公众号粉丝用户基本
     * 
     * @param wxUserInfo 微信公众号粉丝用户基本信息
     * @return 结果
     */
	@Override
	public int updateWxUserInfo(WxUserInfo wxUserInfo)
	{
	    return wxUserInfoMapper.updateWxUserInfo(wxUserInfo);
	}

	/**
     * 删除微信公众号粉丝用户基本对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteWxUserInfoByIds(String ids)
	{
		return wxUserInfoMapper.deleteWxUserInfoByIds(Convert.toStrArray(ids));
	}
	
}
