package controllers.admin.vo;

import cn.uc.bc.common.dto.ProvinceInfo;

/**
 * 省份Vo
 * User: zhangmh
 * Date: 12-12-4
 * Time: 下午1:40
 */
public class ProvinceVo {
    /**
     * Id
     */
    private int id;

    /**
     * 名称
     */
    private String name = "";

    /**
     * 是否发布
     */
    private boolean apply;

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

    public boolean isApply() {
        return apply;
    }

    public void setApply(boolean apply) {
        this.apply = apply;
    }

    public void fromDto(ProvinceInfo provinceInfo) {
        this.setId(provinceInfo.getId());
        this.setApply(provinceInfo.isApply());
        this.setName(provinceInfo.getName());
    }

    public void toDto(ProvinceInfo provinceInfo) {
        provinceInfo.setId(this.id);
        provinceInfo.setName(this.name);
        provinceInfo.setApply(this.apply);
    }
}
