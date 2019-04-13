package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.WxUserInfo;
import com.ruoyi.system.service.IWxUserInfoService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 微信公众号粉丝用户基本 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-03-26
 */
@Controller
@RequestMapping("/system/wxUserInfo")
public class WxUserInfoController extends BaseController
{
    private String prefix = "system/wxUserInfo";
	
	@Autowired
	private IWxUserInfoService wxUserInfoService;
	
	@RequiresPermissions("system:wxUserInfo:view")
	@GetMapping()
	public String wxUserInfo()
	{
	    return prefix + "/wxUserInfo";
	}
	
	/**
	 * 查询微信公众号粉丝用户基本列表
	 */
	@RequiresPermissions("system:wxUserInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(WxUserInfo wxUserInfo)
	{
		startPage();
        List<WxUserInfo> list = wxUserInfoService.selectWxUserInfoList(wxUserInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出微信公众号粉丝用户基本列表
	 */
	@RequiresPermissions("system:wxUserInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WxUserInfo wxUserInfo)
    {
    	List<WxUserInfo> list = wxUserInfoService.selectWxUserInfoList(wxUserInfo);
        ExcelUtil<WxUserInfo> util = new ExcelUtil<WxUserInfo>(WxUserInfo.class);
        return util.exportExcel(list, "wxUserInfo");
    }
	
	/**
	 * 新增微信公众号粉丝用户基本
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存微信公众号粉丝用户基本
	 */
	@RequiresPermissions("system:wxUserInfo:add")
	@Log(title = "微信公众号粉丝用户基本", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(WxUserInfo wxUserInfo)
	{		
		return toAjax(wxUserInfoService.insertWxUserInfo(wxUserInfo));
	}

	/**
	 * 修改微信公众号粉丝用户基本
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		WxUserInfo wxUserInfo = wxUserInfoService.selectWxUserInfoById(id);
		mmap.put("wxUserInfo", wxUserInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存微信公众号粉丝用户基本
	 */
	@RequiresPermissions("system:wxUserInfo:edit")
	@Log(title = "微信公众号粉丝用户基本", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(WxUserInfo wxUserInfo)
	{		
		return toAjax(wxUserInfoService.updateWxUserInfo(wxUserInfo));
	}
	
	/**
	 * 删除微信公众号粉丝用户基本
	 */
	@RequiresPermissions("system:wxUserInfo:remove")
	@Log(title = "微信公众号粉丝用户基本", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(wxUserInfoService.deleteWxUserInfoByIds(ids));
	}
	
}
