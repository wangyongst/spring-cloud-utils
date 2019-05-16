package com.spring.cloud.utils.utils.db;

import com.spring.cloud.utils.utils.result.Result;
import com.spring.cloud.utils.utils.result.ResultStatus;
import org.apache.commons.lang.RandomStringUtils;

public class IdUtils {

    public static Result createId() {
        Result result = new Result();
        result.setStatus(ResultStatus.OK);
        result.setData(RandomStringUtils.randomAlphanumeric(7) + "-" + RandomStringUtils.randomAlphanumeric(7) + "-" + RandomStringUtils.randomAlphanumeric(7) + "-" + RandomStringUtils.randomAlphanumeric(8));
        return result;
    }
}
