package controllers.admin.vo;

import cn.uc.bc.common.dto.DataSourceInfo;
import cn.uc.bc.common.dto.DocumentInfo;

import java.util.Date;

/**
 * 内容VO
 * <p/>
 * Date: 12-11-13
 * Time: 下午9:19
 *
 * @author : zhuxm
 */
public class DocumentVo {

    /**
     * ID
     */
    private int id;

    /**
     * 标题
     */
    private String title = "";

    /**
     * 标题URL
     */
    private String titleUrl = "";

    /**
     * 内容1
     */
    private String c1 = "";

    /**
     * 内容2
     */
    private String c2 = "";

    /**
     * 内容1
     */
    private String c3 = "";

    /**
     * 内容2
     */
    private String c4 = "";

    /**
     * 按钮URL
     */
    private String buttonUrl = "";

    /**
     * 数据源ID
     */
    private int dataSourceId;

    /**
     * 关键字
     */
    private String keyword = "";

    /**
     * 是否应用
     */
    private boolean apply;

    /**
     * 权重
     */
    private int weight;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date modifyTime;

    /**
     * 数据源名称
     */
    private String dataSourceName;

    /**
     * 数据类型Id
     */
    private int dataTypeId;

    /**
     * 数据类型名称
     */
    private String dataTypeName;

    /**
     * 合作方Id
     */
    private int partnerId;

    /**
     * 合作方名称
     */
    private String partnerName;

    /**
     * 平台Id
     */
    private String platformIds;

    /**
     * 平台名称
     */
    private String platformNames;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getButtonUrl() {
        return buttonUrl;
    }

    public void setButtonUrl(String buttonUrl) {
        this.buttonUrl = buttonUrl;
    }

    public int getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean isApply() {
        return apply;
    }

    public void setApply(boolean apply) {
        this.apply = apply;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
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

    /**
     * 从Dto读取数据
     *
     * @param document 内容Dto
     */
    public void fromDto(DocumentInfo document) {
        this.setId(document.getId());
        this.setTitle(document.getTitle());
        this.setTitleUrl(document.getTitleUrl());
        this.setC1(document.getC1());
        this.setC2(document.getC2());
        this.setC3(document.getC3());
        this.setC4(document.getC4());
        this.setWeight(document.getWeight());
        this.setButtonUrl(document.getButtonUrl());
        this.setDataSourceId(document.getDataSourceId());
        this.setApply(document.isApply());
        this.setKeyword(document.getKeywords());
        this.setApply(document.isApply());
        this.setWeight(document.getWeight());
        this.setCreateTime(document.getCreateTime());
        this.setModifyTime(document.getModifyTime());
        this.setDataSourceName(document.getDataSourceName());
        this.setDataTypeId(document.getDataTypeId());
        this.setDataTypeName(document.getDataTypeName());
        this.setPartnerId(document.getPartnerId());
        this.setPartnerName(document.getPartnerName());
        this.setPlatformIds(document.getPlatformIds());
        this.setPlatformNames(document.getPlatformNames());
    }

    /**
     * 输出数据到Dto处
     *
     * @param document 内容Dto
     */
    public void toDto(DocumentInfo document) {
        document.setId(this.getId());
        document.setTitle(this.getTitle());
        document.setTitleUrl(this.getTitleUrl());
        document.setC1(this.getC1());
        document.setC2(this.getC2());
        document.setC3(this.getC3());
        document.setC4(this.getC4());
        document.setWeight(this.getWeight());
        document.setButtonUrl(this.getButtonUrl());
        document.setDataSourceId(this.getDataSourceId());
        document.setApply(this.isApply());
        document.setKeywords(this.getKeyword());
        document.setApply(this.isApply());
        document.setWeight(this.getWeight());
        document.setCreateTime(this.getCreateTime());
        document.setModifyTime(this.getModifyTime());
        document.setDataSourceName(this.getDataSourceName());
        document.setDataTypeId(this.getDataTypeId());
        document.setDataTypeName(this.getDataTypeName());
        document.setPartnerId(this.getPartnerId());
        document.setPartnerName(this.getPartnerName());
        document.setPlatformIds(this.getPlatformIds());
        document.setPlatformNames(this.getPlatformNames());
    }
}
