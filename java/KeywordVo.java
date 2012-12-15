package controllers.admin.vo;

import cn.uc.bc.common.dto.KeywordsInfo;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-4
 * Time: 下午1:40
 * To change this template use File | Settings | File Templates.
 */
public class KeywordVo {
    /**
     * Id
     */
    private int id;

    /**
     * 名称
     */
    private String name = "";

    /**
     * 拼音
     */
    private String pinyin = "";

    /**
     * 热度
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

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void fromDto(KeywordsInfo keyword) {
        this.setId(keyword.getId());
        this.setPinyin(keyword.getPinyin());
        this.setName(keyword.getName());
        this.setWeight(keyword.getWeight());
    }

    public void toDto(KeywordsInfo keyword) {
        keyword.setId(this.id);
        keyword.setName(this.name);
        keyword.setPinyin(this.pinyin);
        keyword.setWeight(this.weight);
    }
}
