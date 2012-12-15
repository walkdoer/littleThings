package controllers.admin.vo;

import cn.uc.bc.common.dto.DataTypeInfo;
import cn.uc.bc.common.dto.PlatformInfo;

/**
 * 数据类型VO
 * <p/>
 * Date: 12-11-6
 * Time: 上午10:31
 *
 * @author : zhuxm
 */
public class PlatformVo {
    /**
     * Id
     */
    private int id;

    /**
     * 名称
     */
    private String name = "";


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

    /**
     * 从Dto读取数据
     *
     * @param platform 平台Dto
     */
    public void fromDto(PlatformInfo platform) {
        this.setId(platform.getId());
        this.setName(platform.getName());
    }

    /**
     * 输出数据到Dto处
     *
     * @param platform 平台Dto
     */
    public void toDto(PlatformInfo platform) {
        platform.setId(this.getId());
        platform.setName(this.getName());
    }
}
