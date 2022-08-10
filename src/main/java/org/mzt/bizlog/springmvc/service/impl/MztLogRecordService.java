package org.mzt.bizlog.springmvc.service.impl;

import com.mzt.logapi.beans.LogRecord;
import com.mzt.logapi.service.ILogRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author muzhantong
 * create on 2022/5/27 4:36 PM
 */
@Slf4j
@Primary
@Service
public class MztLogRecordService implements ILogRecordService {

    @Override
    public void record(LogRecord logRecord) {
        System.out.println("ssssssssssssssssxxxx,{}" + logRecord);
    }

    @Override
    public List<LogRecord> queryLog(String bizNo, String type) {
        return null;
    }

    @Override
    public List<LogRecord> queryLogByBizNo(String bizNo, String type, String subType) {
        return null;
    }
}
