package com.auto.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * XML文件中的根标识
 */
@XmlRootElement(name = "wxlifepay")
/**
 *控制JAXB 绑定类中属性和字段的排序
 * */
@XmlType(propOrder = {
        "head",
        "info"
})
public class QueryResponse {
    private Head head;
    private Info info;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
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
    @XmlType(propOrder = {
            "bill_key",
            "company_id"
    })
    public static class Info{
        private String bill_key;
        private String company_id;

        public String getBill_key() {
            return bill_key;
        }

        public void setBill_key(String bill_key) {
            this.bill_key = bill_key;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }
    }

    }
