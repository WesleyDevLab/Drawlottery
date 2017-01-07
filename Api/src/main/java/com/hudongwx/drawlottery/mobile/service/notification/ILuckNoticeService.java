package com.hudongwx.drawlottery.mobile.service.notification;

import com.hudongwx.drawlottery.mobile.entitys.LuckNotice;

import java.util.List;
import java.util.Map;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author Kiter
 * @version 1.0, 2017/1/6 <br/>
 * @desc <p>
 * <p>
 * 创建　kiter　2017/1/6 9:33　<br/>
 * <p>
 *          中奖通知service
 * <p>
 * @email 346905702@qq.com
 */
public interface ILuckNoticeService {

    //添加用户中奖通知
    boolean addUserLuckNotice(LuckNotice notice);

    //删除用户中奖通知
    boolean deleteUserLuckNotice(LuckNotice notice);

    //查看用户中奖通知
    List<Map<String,Object>> selectByAccount(Long accountId);

    //修改用户中奖通知
    boolean updateUserLuckNotice(LuckNotice notice);
}
