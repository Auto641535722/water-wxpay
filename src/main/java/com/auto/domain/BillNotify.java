package com.auto.domain;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "wxlifepay")
/**
 *控制JAXB 绑定类中属性和字段的排序
 * */
@XmlType(propOrder = {
        "head",
        "info"
})
public class BillNotify {
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
            "company_id",
            "total_num",
            "data",
            "show_fields"
    })
    public static class Info{
        private String bill_key;
        private String company_id;
        private String total_num;
        private Data data;
        private ShowFields show_fields;

        public ShowFields getShow_fields() {
            return show_fields;
        }

        public void setShow_fields(ShowFields show_fields) {
            this.show_fields = show_fields;
        }

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

        public String getTotal_num() {
            return total_num;
        }

        public void setTotal_num(String total_num) {
            this.total_num = total_num;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }

    @XmlType(propOrder = {
            "customer_addr"})
    public static class ShowFields{
        private String customer_addr;

        public String getCustomer_addr() {
            return customer_addr;
        }

        public void setCustomer_addr(String customer_addr) {
            this.customer_addr = customer_addr;
        }
    }
    @XmlType(propOrder = {
            "customer_name",
            "balance",
            "pay_amount",
            "begin_date",
            "end_date",
            "attach",
            "attach1",
            "field1",
            "field2",
            "field3",
            "field4",
            "field5"
    })
    public static class Data{
        private String customer_name;
        private String balance;
        private String pay_amount;
        private String begin_date;
        private String end_date;
        private String attach;
        private String attach1;
        private String field1;
        private String field2;
        private String field3;
        private String field4;
        private String field5;

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getPay_amount() {
            return pay_amount;
        }

        public void setPay_amount(String pay_amount) {
            this.pay_amount = pay_amount;
        }

        public String getBegin_date() {
            return begin_date;
        }

        public void setBegin_date(String begin_date) {
            this.begin_date = begin_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getAttach() {
            return attach;
        }

        public void setAttach(String attach) {
            this.attach = attach;
        }

        public String getAttach1() {
            return attach1;
        }

        public void setAttach1(String attach1) {
            this.attach1 = attach1;
        }

        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public String getField2() {
            return field2;
        }

        public void setField2(String field2) {
            this.field2 = field2;
        }

        public String getField3() {
            return field3;
        }

        public void setField3(String field3) {
            this.field3 = field3;
        }

        public String getField4() {
            return field4;
        }

        public void setField4(String field4) {
            this.field4 = field4;
        }

        public String getField5() {
            return field5;
        }

        public void setField5(String field5) {
            this.field5 = field5;
        }
    }

}
