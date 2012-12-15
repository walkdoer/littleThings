package controllers.admin.vo;

import cn.uc.bc.common.dto.DataTypeInfo;
import cn.uc.bc.common.dto.PartnerInfo;

/**
 * 合作伙伴VO
 * <p/>
 * Date: 12-11-6
 * Time: 上午10:31
 *
 * @author : zhuxm
 */
public class PartnerVo {
    /**
     * Id
     */
    private int id;

    /**
     * 合作伙伴名称
     */
    private String name = "";

    /**
     * 私钥
     */
    private String privateKey = "";

    /**
     * 公钥
     */
    private String publicKey = "";

    /**
     * 密码
     */
    private String password = "";

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

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 从Dto读取数据
     *
     * @param partner Dto
     */
    public void fromDto(PartnerInfo partner) {
        this.setId(partner.getId());
        this.setName(partner.getName());
        this.setPassword(partner.getPassword());
        this.setPublicKey(partner.getPublicKey());
        this.setPrivateKey(partner.getPrivateKey());
    }

    /**
     * 输出数据到Dto处
     *
     * @param partner Dto
     */
    public void toDto(PartnerInfo partner) {
        partner.setId(this.getId());
        partner.setName(this.getName());
        partner.setPassword(this.getPassword());
        partner.setPublicKey(this.getPublicKey());
        partner.setPrivateKey(this.getPrivateKey());
    }
}
