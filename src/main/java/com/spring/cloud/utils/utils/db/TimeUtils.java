package com.spring.cloud.utils.utils.db;

import com.spring.cloud.utils.utils.result.Result;
import com.spring.cloud.utils.utils.result.ResultStatus;
import org.apache.commons.lang.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    public static Result format(long time) {
        Result result = new Result();
        result.setStatus(ResultStatus.OK);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        result.setData(sdf.format(new Date(time)));
        return result;
    }
}
