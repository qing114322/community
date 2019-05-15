package com.qhit.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class CommonlyUtils {

//    算出指定2个时间点之间的小时数
    public static double amountMinute(String startTime,String endTime,String type){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = null;
        Date end =null;
        try {
            start = simpleDateFormat.parse(startTime);
            end = simpleDateFormat.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long amount =end.getTime() - start.getTime();
//        Calendar instance = Calendar.getInstance();
        int digit=1;
        if ("s".equals(type)){
            digit=1000;
        }else if ("m".equals(type)){
            digit=60000;
        }else if ("h".equals(type)){
            digit=3600000;
        }else {
            digit=1;
        }
        return reserveDecimal(amount/digit,2) ;
    }
//  生成指定范围内的随机数   start:开始  end:结束      reserve:保留几位
    public static double creatRandem(double start,double end,int reserve){
        double scope = end - start;
        Random random = new Random();
        return reserveDecimal(random.nextDouble()*scope+start,reserve);
    }
    //保留两位小数    decimal:double类型数  reserveNumber:保留几位
    public static double reserveDecimal(double decimal,int reserveNumber){
        double result = Double.parseDouble(String.format("%."+reserveNumber+"f",decimal));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(CommonlyUtils.amountMinute("2019-01-01 12:00:00","2019-02-01 12:00:00","m"));
        System.out.println(creatRandem(100,300,2));





    }
}
