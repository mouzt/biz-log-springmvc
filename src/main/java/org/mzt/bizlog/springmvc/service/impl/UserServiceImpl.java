package org.mzt.bizlog.springmvc.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.mzt.logapi.starter.annotation.LogRecord;
import lombok.extern.slf4j.Slf4j;
import org.mzt.bizlog.springmvc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author muzhantong
 * create on 2022/5/4 10:50 PM
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Override
    @LogRecord(type = "user", bizNo = "{{#userId}}", success = "测试1234{{#userId}}, Order:{ORDER{#userId}}")
    public String getUserName(String userId) {
        log.info("sssssssssssssssssssssssssss");
        return RandomUtil.getRandom(false).nextInt() + "@"+ userId;
    }
}
