package com.binzikeji.itoken.common.hystrix;

import com.binzikeji.itoken.common.conatants.HttpStatusConstants;
import com.binzikeji.itoken.common.dto.BaseRestult;
import com.binzikeji.itoken.common.utils.MapperUtils;
import com.google.common.collect.Lists;

/**
 * @Description 熔断器
 * @Author Bin
 * @Date 2019/4/16 15:47
 **/
public class Fallback {

    public static String badGateway(){
        BaseRestult baseRestult = BaseRestult.notOk(Lists.newArrayList(
                new BaseRestult.Error(
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getContent()))));
        try {
            return MapperUtils.obj2json(baseRestult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
