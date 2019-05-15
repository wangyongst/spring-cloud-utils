package com.spring.cloud.utils.utils.result;

public class ResultCode {

    //正常结果代码
    public final static int OK = 1;
    //熔断结果
    public final static int HYSTRIC = 1001;
    //查询数据失败
    public final static int QUERY_ERROR = 1002;
    //新增数据失败
    public final static int CREATE_ERROR = 1003;
    //修改数据失败
    public final static int UPDATE_ERROR = 1004;
    //删除数据失败
    public final static int DELETE_ERROR = 1005;
}
