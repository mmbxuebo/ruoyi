package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 微信公众号粉丝用户基本表 wx_user_info
 * 
 * @author ruoyi
 * @date 2019-03-26
 */
public class WxUserInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键ID */
	private Long id;
	/** 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息 */
	private Integer subscribe;
	/** 用户的标识openid，对当前公众号唯一 */
	private String openid;
	/** 用户的昵称 */
	private String nickname;
	/** 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知 */
	private Integer sex;
	/** 用户所在国家 */
	private String country;
	/** 用户所在省份 */
	private String province;
	/** 用户所在城市 */
	private String city;
	/** 用户的语言 */
	private String language;
	/** 用户头像,最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。 */
	private String headimgurl;
	/** 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间 */
	private Date subscribeTime;
	/** 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。 */
	private String unionid;
	/** 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注 */
	private String remark;
	/** 用户所在的分组ID（暂时兼容用户分组旧接口） */
	private Integer groupid;
	/** 用户被打上的标签ID列表 */
	private String tagidList;
	/** 返回用户关注的渠道来源，ADD_SCENE_SEARCH 公众号搜索，ADD_SCENE_ACCOUNT_MIGRATION 公众号迁移，ADD_SCENE_PROFILE_CARD 名片分享，ADD_SCENE_QR_CODE 扫描二维码，ADD_SCENEPROFILE LINK 图文页内名称点击，ADD_SCENE_PROFILE_ITEM 图文页右上角菜单，ADD_SCENE_PAID 支付后关注，ADD_SCENE_OTHERS 其他 */
	private String subscribeScene;
	/** 二维码扫码场景 */
	private String qrScene;
	/** 二维码扫码场景描述 */
	private String qrSceneStr;
	/** 更新人ID */
	private Long updateUserId;
	/** 更新时间 */
	private Date updateTime;
	/** 状态(0 正常 -1 已删除 1 黑名单) */
	private Integer status;
	/** 更新状态（0 正常 1 有更新） */
	private Integer updateStatus;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setSubscribe(Integer subscribe) 
	{
		this.subscribe = subscribe;
	}

	public Integer getSubscribe() 
	{
		return subscribe;
	}
	public void setOpenid(String openid) 
	{
		this.openid = openid;
	}

	public String getOpenid() 
	{
		return openid;
	}
	public void setNickname(String nickname) 
	{
		this.nickname = nickname;
	}

	public String getNickname() 
	{
		return nickname;
	}
	public void setSex(Integer sex) 
	{
		this.sex = sex;
	}

	public Integer getSex() 
	{
		return sex;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getCountry() 
	{
		return country;
	}
	public void setProvince(String province) 
	{
		this.province = province;
	}

	public String getProvince() 
	{
		return province;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getCity() 
	{
		return city;
	}
	public void setLanguage(String language) 
	{
		this.language = language;
	}

	public String getLanguage() 
	{
		return language;
	}
	public void setHeadimgurl(String headimgurl) 
	{
		this.headimgurl = headimgurl;
	}

	public String getHeadimgurl() 
	{
		return headimgurl;
	}
	public void setSubscribeTime(Date subscribeTime) 
	{
		this.subscribeTime = subscribeTime;
	}

	public Date getSubscribeTime() 
	{
		return subscribeTime;
	}
	public void setUnionid(String unionid) 
	{
		this.unionid = unionid;
	}

	public String getUnionid() 
	{
		return unionid;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}
	public void setGroupid(Integer groupid) 
	{
		this.groupid = groupid;
	}

	public Integer getGroupid() 
	{
		return groupid;
	}
	public void setTagidList(String tagidList) 
	{
		this.tagidList = tagidList;
	}

	public String getTagidList() 
	{
		return tagidList;
	}
	public void setSubscribeScene(String subscribeScene) 
	{
		this.subscribeScene = subscribeScene;
	}

	public String getSubscribeScene() 
	{
		return subscribeScene;
	}
	public void setQrScene(String qrScene) 
	{
		this.qrScene = qrScene;
	}

	public String getQrScene() 
	{
		return qrScene;
	}
	public void setQrSceneStr(String qrSceneStr) 
	{
		this.qrSceneStr = qrSceneStr;
	}

	public String getQrSceneStr() 
	{
		return qrSceneStr;
	}
	public void setUpdateUserId(Long updateUserId) 
	{
		this.updateUserId = updateUserId;
	}

	public Long getUpdateUserId() 
	{
		return updateUserId;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setStatus(Integer status) 
	{
		this.status = status;
	}

	public Integer getStatus() 
	{
		return status;
	}
	public void setUpdateStatus(Integer updateStatus) 
	{
		this.updateStatus = updateStatus;
	}

	public Integer getUpdateStatus() 
	{
		return updateStatus;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("subscribe", getSubscribe())
            .append("openid", getOpenid())
            .append("nickname", getNickname())
            .append("sex", getSex())
            .append("country", getCountry())
            .append("province", getProvince())
            .append("city", getCity())
            .append("language", getLanguage())
            .append("headimgurl", getHeadimgurl())
            .append("subscribeTime", getSubscribeTime())
            .append("unionid", getUnionid())
            .append("remark", getRemark())
            .append("groupid", getGroupid())
            .append("tagidList", getTagidList())
            .append("subscribeScene", getSubscribeScene())
            .append("qrScene", getQrScene())
            .append("qrSceneStr", getQrSceneStr())
            .append("updateUserId", getUpdateUserId())
            .append("updateTime", getUpdateTime())
            .append("status", getStatus())
            .append("updateStatus", getUpdateStatus())
            .toString();
    }
}
