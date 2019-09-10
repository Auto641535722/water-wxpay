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
public class QueryRequest {
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
            "merchantid"

    })
    public static class Head{
        private String version;
        private String trancode;
        private String transeqnum;
        private String merchantid;

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
    }

    @XmlType(propOrder = {
            "bill_key",
            "company_id",
            "begin_num",
            "query_num",
            "extends1",
            "extends2",
            "extends3",
            "extends4"

    })
    public static class Info{
        private String bill_key;
        private String company_id;
        private String begin_num;
        private String query_num;
        private String extends1;
        private String extends2;
        private String extends3;
        private String extends4;

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

        public String getBegin_num() {
            return begin_num;
        }

        public void setBegin_num(String begin_num) {
            this.begin_num = begin_num;
        }

        public String getQuery_num() {
            return query_num;
        }

        public void setQuery_num(String query_num) {
            this.query_num = query_num;
        }

        public String getExtends1() {
            return extends1;
        }

        public void setExtends1(String extends1) {
            this.extends1 = extends1;
        }

        public String getExtends2() {
            return extends2;
        }

        public void setExtends2(String extends2) {
            this.extends2 = extends2;
        }

        public String getExtends3() {
            return extends3;
        }

        public void setExtends3(String extends3) {
            this.extends3 = extends3;
        }

        public String getExtends4() {
            return extends4;
        }

        public void setExtends4(String extends4) {
            this.extends4 = extends4;
        }
    }
}
