package controllers.admin.vo;

import cn.uc.bc.common.dto.DataTypeInfo;

/**
 * 数据类型VO
 * <p/>
 * Date: 12-11-6
 * Time: 上午10:31
 *
 * @author : zhuxm
 */
public class DataTypeVo {
    /**
     * Id
     */
    private int id;

    /**
     * 名称
     */
    private String name = "";

    /**
     * 按钮名称
     */
    private String buttonName = "";

    /**
     * 权重
     */
    private int weight;

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

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 从Dto读取数据
     *
     * @param dataType 数据类型Dto
     */
    public void fromDto(DataTypeInfo dataType) {
        this.setId(dataType.getId());
        this.setName(dataType.getName());
        this.setButtonName(dataType.getButtonName());
        this.setWeight(dataType.getWeight());
    }

    /**
     * 输出数据到Dto处
     *
     * @param dataType 数据类型Dto
     */
    public void toDto(DataTypeInfo dataType) {
        dataType.setId(this.getId());
        dataType.setName(this.getName());
        dataType.setButtonName(this.getButtonName());
        dataType.setWeight(this.getWeight());
    }
}
