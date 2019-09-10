package com.auto.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "wxlifepay")
/**
 *控制JAXB 绑定类中属性和字段的排序
 * */
@XmlType(propOrder = {
        "head"
})
public class BillNotifyResponse {
    private Head head;


    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @XmlType(propOrder = {
            "version",
            "trancode",
            "transeqnum",
            "merchantid",
            "ret_code",
            "err_msg"

    })
    public static class Head{
        private String version;
        private String trancode;
        private String transeqnum;
        private String merchantid;
        private String ret_code;
        private String err_msg;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTrancode() {
            return trancode;
        }

        public void setTrancode(String trancode) {
            this.trancode = trancode;
        }

        public String getTranseqnum() {
            return transeqnum;
        }

        public void setTranseqnum(String transeqnum) {
            this.transeqnum = transeqnum;
        }

        public String getMerchantid() {
            return merchantid;
        }

        public void setMerchantid(String merchantid) {
            this.merchantid = merchantid;
        }

        public String getRet_code() {
            return ret_code;
        }

        public void setRet_code(String ret_code) {
            this.ret_code = ret_code;
        }

        public String getErr_msg() {
            return err_msg;
        }

        public void setErr_msg(String err_msg) {
            this.err_msg = err_msg;
        }
    }
}
