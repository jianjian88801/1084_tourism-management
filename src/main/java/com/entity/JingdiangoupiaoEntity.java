package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 景点购票
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
@TableName("jingdiangoupiao")
public class JingdiangoupiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingdiangoupiaoEntity() {
		
	}
	
	public JingdiangoupiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 购票编号
	 */
					
	private String goupiaobianhao;
	
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 景点分类
	 */
					
	private String jingdianfenlei;
	
	/**
	 * 门票价格
	 */
					
	private Float menpiaojiage;
	
	/**
	 * 购票时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date goupiaoshijian;
	
	/**
	 * 购票详情
	 */
					
	private String goupiaoxiangqing;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：购票编号
	 */
	public void setGoupiaobianhao(String goupiaobianhao) {
		this.goupiaobianhao = goupiaobianhao;
	}
	/**
	 * 获取：购票编号
	 */
	public String getGoupiaobianhao() {
		return goupiaobianhao;
	}
	/**
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
	/**
	 * 设置：景点分类
	 */
	public void setJingdianfenlei(String jingdianfenlei) {
		this.jingdianfenlei = jingdianfenlei;
	}
	/**
	 * 获取：景点分类
	 */
	public String getJingdianfenlei() {
		return jingdianfenlei;
	}
	/**
	 * 设置：门票价格
	 */
	public void setMenpiaojiage(Float menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	/**
	 * 获取：门票价格
	 */
	public Float getMenpiaojiage() {
		return menpiaojiage;
	}
	/**
	 * 设置：购票时间
	 */
	public void setGoupiaoshijian(Date goupiaoshijian) {
		this.goupiaoshijian = goupiaoshijian;
	}
	/**
	 * 获取：购票时间
	 */
	public Date getGoupiaoshijian() {
		return goupiaoshijian;
	}
	/**
	 * 设置：购票详情
	 */
	public void setGoupiaoxiangqing(String goupiaoxiangqing) {
		this.goupiaoxiangqing = goupiaoxiangqing;
	}
	/**
	 * 获取：购票详情
	 */
	public String getGoupiaoxiangqing() {
		return goupiaoxiangqing;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
