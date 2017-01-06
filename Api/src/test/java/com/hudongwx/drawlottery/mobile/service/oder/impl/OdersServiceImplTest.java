package com.hudongwx.drawlottery.mobile.service.oder.impl;

import com.hudongwx.drawlottery.mobile.TestBaseMapper;
import com.hudongwx.drawlottery.mobile.entitys.Orders;
import com.hudongwx.drawlottery.mobile.mappers.OrdersMapper;
import com.hudongwx.drawlottery.mobile.service.oder.IOdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author Kiter
 * @version 1.0, 2016/12/24 <br/>
 * @desc <p>
 * <p>
 * 创建　kiter　2016/12/24 15:01　<br/>
 * <p>
 * 什么类？
 * <p>
 * @email 346905702@qq.com
 */
public class OdersServiceImplTest extends TestBaseMapper {
    @Autowired
    IOdersService odersSer;
    @Test
    public void testAddOder() throws Exception {


        //测试完成    可用

    }

    @Autowired
    OrdersMapper mapper;

    @Test
    public void testSelectOder() throws Exception{

        Orders orders = new Orders();
        orders.setUserAccountId(1000l);
        List<Orders> select = mapper.selectByUserAccount(1000l);
        for (Orders o : select){
            System.out.println(o.getSubmitDate());
        }

//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(timeStart);
        /*List<Orders> oderses = odersSer.selectByUser(1l);
        System.out.println(oderses.size());
        Assert.assertNotNull(oderses);*/

        //测试完成   可用；

    }

    @Test
    public void testDeleteOder() throws Exception {
        boolean b = odersSer.deleteOder(2L);
        Assert.assertTrue(b);

        //测试成功  可用
    }

    @Test
    public void testUpdate() throws Exception {
        Orders oders = new Orders();
        oders.setId(1l);
        oders.setSubmitDate(new Date());
        oders.setUserAccountId(3l);
        boolean update = odersSer.update(oders);
        Assert.assertTrue(update);

        //测试成功  可用
    }

}