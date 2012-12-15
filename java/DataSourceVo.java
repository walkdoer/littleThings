package controllers.admin.vo;

import cn.uc.bc.common.dto.DataSourceInfo;

import java.util.Date;

/**
 * 数据源VO
 * <p/>
 * Date: 12-11-7
 * Time: 下午2:59
 *
 * @author : zhuxm
 */
public class DataSourceVo {
    /**
     * ID
     */
    private int id;

    /**
     * 数据源名称
     */
    private String name = "";

    /**
     * 合作商Id
     */
    private int partnerId;

    /**
     * 合作商名称
     */
    private String partnerName = "";

    /**
     * 数据源类型  1：手工录入 2：爬取接口类
     */
    private int type;

    /**
     * 权重
     */
    private int weight;

    /**
     * 适配平台的ID
     */
    private String platformIds = "";

    /**
     * 适配平台名称
     */
    private String platformNames = "";

    /**
     * 是否应用
     */
    private boolean apply;

    /**
     * 数据类型Id
     */
    private int dataTypeId;

    /**
     * 数据类型名称
     */
    private String dataTypeName = "";

    /**
     * 标题URL前缀
     */
    private String titleUrlPrefix = "";

    /**
     * 按钮URL前缀
     */
    private String buttonUrlPrefix = "";

    /**
     * 内容1前缀
     */
    private String c1Prefix = "";

    /**
     * 内容1后缀
     */
    private String c1Postfix = "";

    /**
     * 内容2前缀
     */
    private String c2Prefix = "";

    /**
     * 内容2后缀
     */
    private String c2Postfix = "";

    /**
     * 内容1前缀
     */
    private String c3Prefix = "";

    /**
     * 内容1后缀
     */
    private String c3Postfix = "";

    /**
     * 内容2前缀
     */
    private String c4Prefix = "";

    /**
     * 内容2后缀
     */
    private String c4Postfix = "";

    /**
     * 内容排序字段
     */
    private String serial = "";

    /**
     * 爬取地址
     */
    private String crawUrl = "";

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更改时间
     */
    private Date modifyTime;

    /**
     * 上一次爬取时间
     */
    private Date crawTime;


    /**
     * 同步方式
     */
    private int syncType;

    /**
     * 爬取间隔
     */
    private float crawInterval;

    /**
     * 备注
     */
    private String remark;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPlatformIds() {
        return platformIds;
    }

    public void setPlatformIds(String platformIds) {
        this.platformIds = platformIds;
    }

    public String getPlatformNames() {
        return platformNames;
    }

    public void setPlatformNames(String platformNames) {
        this.platformNames = platformNames;
    }

    public boolean isApply() {
        return apply;
    }

    public void setApply(boolean apply) {
        this.apply = apply;
    }

    public int getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(int dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    public String getTitleUrlPrefix() {
        return titleUrlPrefix;
    }

    public void setTitleUrlPrefix(String titleUrlPrefix) {
        this.titleUrlPrefix = titleUrlPrefix;
    }

    public String getButtonUrlPrefix() {
        return buttonUrlPrefix;
    }

    public void setButtonUrlPrefix(String buttonUrlPrefix) {
        this.buttonUrlPrefix = buttonUrlPrefix;
    }

    public String getC1Prefix() {
        return c1Prefix;
    }

    public void setC1Prefix(String c1Prefix) {
        this.c1Prefix = c1Prefix;
    }

    public String getC1Postfix() {
        return c1Postfix;
    }

    public void setC1Postfix(String c1Postfix) {
        this.c1Postfix = c1Postfix;
    }

    public String getC2Prefix() {
        return c2Prefix;
    }

    public void setC2Prefix(String c2Prefix) {
        this.c2Prefix = c2Prefix;
    }

    public String getC2Postfix() {
        return c2Postfix;
    }

    public void setC2Postfix(String c2Postfix) {
        this.c2Postfix = c2Postfix;
    }

    public String getC3Prefix() {
        return c3Prefix;
    }

    public void setC3Prefix(String c3Prefix) {
        this.c3Prefix = c3Prefix;
    }

    public String getC3Postfix() {
        return c3Postfix;
    }

    public void setC3Postfix(String c3Postfix) {
        this.c3Postfix = c3Postfix;
    }

    public String getC4Prefix() {
        return c4Prefix;
    }

    public void setC4Prefix(String c4Prefix) {
        this.c4Prefix = c4Prefix;
    }

    public String getC4Postfix() {
        return c4Postfix;
    }

    public void setC4Postfix(String c4Postfix) {
        this.c4Postfix = c4Postfix;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getCrawUrl() {
        return crawUrl;
    }

    public void setCrawUrl(String crawUrl) {
        this.crawUrl = crawUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCrawTime() {
        return crawTime;
    }

    public void setCrawTime(Date crawTime) {
        this.crawTime = crawTime;
    }

    public int getSyncType() {
        return syncType;
    }

    public void setSyncType(int syncType) {
        this.syncType = syncType;
    }

    public float getCrawInterval() {
        return crawInterval;
    }

    public void setCrawInterval(float crawInterval) {
        this.crawInterval = crawInterval;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 从Dto读取数据
     *
     * @param dataSource 数据源Dto
     */
    public void fromDto(DataSourceInfo dataSource) {
        this.setId(dataSource.getId());
        this.setName(dataSource.getName());
        this.setPartnerId(dataSource.getPartnerId());
        this.setPartnerName(dataSource.getPartnerName());
        this.setType(dataSource.getType());
        this.setWeight(dataSource.getWeight());
        this.setPlatformIds(dataSource.getPlatformIds());
        this.setPlatformNames(dataSource.getPlatformNames());
        this.setApply(dataSource.isApply());
        this.setDataTypeId(dataSource.getDataTypeId());
        this.setDataTypeName(dataSource.getDataTypeName());
        this.setTitleUrlPrefix(dataSource.getTitleUrlPrefix());
        this.setButtonUrlPrefix(dataSource.getButtonUrlPrefix());
        this.setC1Prefix(dataSource.getC1Prefix());
        this.setC1Postfix(dataSource.getC1Postfix());
        this.setC2Prefix(dataSource.getC2Prefix());
        this.setC2Postfix(dataSource.getC2Postfix());
        this.setC3Prefix(dataSource.getC3Prefix());
        this.setC3Postfix(dataSource.getC3Postfix());
        this.setC4Prefix(dataSource.getC4Prefix());
        this.setC4Postfix(dataSource.getC4Postfix());
        this.setSerial(dataSource.getSerial());
        this.setCrawUrl(dataSource.getCrawUrl());
        this.setCreateTime(dataSource.getCreateTime());
        this.setModifyTime(dataSource.getModifyTime());
        this.setCrawTime(dataSource.getCrawTime());
        this.setCrawInterval(dataSource.getCrawInterval());
        this.setSyncType(dataSource.getSyncType());
        this.setRemark(dataSource.getRemark());
    }

    /**
     * 输出数据到Dto处
     *
     * @param dataSource 数据源Dto
     */
    public void toDto(DataSourceInfo dataSource) {
        dataSource.setId(this.getId());
        dataSource.setName(this.getName());
        dataSource.setPartnerId(this.getPartnerId());
        dataSource.setPartnerName(this.getPartnerName());
        dataSource.setType(this.getType());
        dataSource.setWeight(this.getWeight());
        dataSource.setPlatformIds(this.getPlatformIds());
        dataSource.setPlatformNames(this.getPlatformNames());
        dataSource.setApply(this.isApply());
        dataSource.setDataTypeId(this.getDataTypeId());
        dataSource.setDataTypeName(this.getDataTypeName());
        dataSource.setTitleUrlPrefix(this.getTitleUrlPrefix());
        dataSource.setButtonUrlPrefix(this.getButtonUrlPrefix());
        dataSource.setC1Prefix(this.getC1Prefix());
        dataSource.setC1Postfix(this.getC1Postfix());
        dataSource.setC2Prefix(this.getC2Prefix());
        dataSource.setC2Postfix(this.getC2Postfix());
        dataSource.setC3Prefix(this.getC3Prefix());
        dataSource.setC3Postfix(this.getC3Postfix());
        dataSource.setC4Prefix(this.getC4Prefix());
        dataSource.setC4Postfix(this.getC4Postfix());
        dataSource.setSerial(this.getSerial());
        dataSource.setCrawUrl(this.getCrawUrl());
        dataSource.setCrawInterval(this.getCrawInterval());
        dataSource.setSyncType(this.getSyncType());
        dataSource.setRemark(this.getRemark());

        if (this.getCreateTime() != null) {
            dataSource.setCreateTime(this.getCreateTime());
        }
        if (this.getModifyTime() != null) {
            dataSource.setModifyTime(this.getModifyTime());
        }
        if (this.getCrawTime() != null) {
            dataSource.setCrawTime(this.getCrawTime());
        }
    }
}
