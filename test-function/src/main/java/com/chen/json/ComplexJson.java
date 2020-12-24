package com.chen.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: JINCHENCHEN
 * date: 2020/12/17
 */
public class ComplexJson {
    public static void main(String[] args) {
        mapTest();
    }
    public static void mapTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("acceptDate", "20180404121212");
        map.put("channelNbr", "3101001008663");
        map.put("extCustOrderId", "WT20190904832983900100");
        map.put("sysSource", "104");
        map.put("ordSubmit", "1003");
        Map<String, Object> orderContactsInfo = new HashMap<>();
        orderContactsInfo.put("contactName", "董靓");
        orderContactsInfo.put("actType", "ADD");
        orderContactsInfo.put("contactPhone", "18901860528");
        map.put("orderContactsInfo", orderContactsInfo);
        map.put("custId", "100234112651");
        map.put("custName", "测试用户100234112651");
        map.put("createStaff", "SHCT_WEB");
        List<Map<String, Object>> devStaffInfos = new ArrayList<>();
        Map<String, Object> devStaffInfo = new HashMap<>();
        devStaffInfo.put("devStaffCode", "SHCT_WEB");
        devStaffInfo.put("devStaffType", "1000");
        devStaffInfo.put("actType", "ADD");
        devStaffInfos.add(devStaffInfo);
        map.put("devStaffInfos", devStaffInfos);
        List<Map<String, Object>> mainOfferOrderItems = new ArrayList<>();
        Map<String, Object> mainOfferOrderItem = new HashMap<>();
        mainOfferOrderItem.put("offerType", "11");
        mainOfferOrderItem.put("offerName", "202004-翼长宽合作品牌单宽100M套餐，480元/半年");
        mainOfferOrderItem.put("offerId", "100000074729219");
        mainOfferOrderItem.put("actType", "ADD");
        mainOfferOrderItem.put("ownerCustId", "100234112651");

        List<Map<String, Object>> accProdOrderItems = new ArrayList<>();
        Map<String, Object> accProdOrderItem = new HashMap<>();
        accProdOrderItem.put("addressDesc", "严镇路75弄20号5层501室");
        accProdOrderItem.put("acctId", "400000446241");
        accProdOrderItem.put("prodFuncType", "101");
        accProdOrderItem.put("prodId", "400290147");
        accProdOrderItem.put("ownerCustId", "100234112651");
        accProdOrderItem.put("paymentModeCd", "2100");
        accProdOrderItem.put("addressId", "48234535");
        accProdOrderItem.put("prodName", "鹏博士宽带");
        accProdOrderItem.put("actType", "ADD");
        accProdOrderItem.put("prodInstId", "-12");
        accProdOrderItem.put("stdAddrId", "48234535");
        accProdOrderItem.put("roleId", "10200001");
        accProdOrderItems.add(accProdOrderItem);
        mainOfferOrderItem.put("accProdOrderItems", accProdOrderItems);
        mainOfferOrderItem.put("commodityType", "10");
        mainOfferOrderItem.put("offerInstId", "-11");
        mainOfferOrderItem.put("paymentModeCd", "2100");

        mainOfferOrderItems.add(mainOfferOrderItem);
        map.put("mainOfferOrderItems", mainOfferOrderItems);
        String mapJson = JSON.toJSONString(map);
        System.out.println("mapJson = " + mapJson);
//        Map<String, String> mapFromJson = JSON.parseObject(mapJson, Map.class);
//        System.out.println("mapFromJson.toString() = " + mapFromJson);
    }
}
