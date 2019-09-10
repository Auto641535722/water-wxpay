package com.auto.controller;

import com.auto.domain.BillNotify;
import com.auto.domain.QueryRequest;
import com.auto.service.QueryWaterInfo;
import com.auto.util.EncryptUtil;
import com.auto.util.XmlAndJavaObjectConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.io.IOUtils;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author a
 */
@RestController
public class QueryInfoController {
    @Autowired
    private QueryWaterInfo queryWaterInfo;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public String queryInfo(HttpServletRequest request) throws Exception {
        String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
        //校验数据是否合法
        String [] xmls = xmlResult.split("<",2);
        String sign = xmls[0];
        String xmlReal = xmls[1];
        //使用sha256校验数据是否合法
        if (!EncryptUtil.getSHA256(xmlReal).equals(sign)){
            //验证未通过
            return null;
        }
        
//        xmlResult = "<wxlifepay>\n" +
//                "<head>" +
//                "<version>1.0.1</version> <trancode>querycallback</trancode> <transeqnum>10000001</transeqnum> <merchantid>1234567</merchantid> <ret_code>0</ret_code> <err_msg>success</err_msg>" +
//                "</head> <info>\n" +
//                "<bill_key>12345678</bill_key> <company_id>12345</company_id> <total_num>2</total_num>\n" +
//                "<data>\n" +
//                "<customer_name>李四</customer_name>\n" +
//                "<balance>0</balance> <pay_amount>199</pay_amount> <begin_date>201501</begin_date> <end_date>201501</end_date> <attach> attach </attach> <attach1> attach </attach1> <field1> field1 </field1>\n" +
//                "<field2> field2 </field2> <field3>field3</field3> <field4>field4</field4> <field5>field5</field5>\n" +
//                "<show_value>200 元</show_value> </data>\n" +
//                "<show_fields><customer_addr>深圳市 10000 号</customer_addr></show_fields>\n" +
//                "</info> </wxlifepay>\n";
        BillNotify billNotify = (BillNotify) XmlAndJavaObjectConvert.convertXmlStrToObject(BillNotify.class,xmlResult);
        queryWaterInfo.queryWaterInfo(billNotify.getInfo().getCompany_id());
        return null;
    }

}
