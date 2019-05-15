package com.spring.cloud.utils.utils.result;

public class ResultCode {

    //正常结果代码
    public final static int OK = 1;

    //查询数据失败
    public final static int QUERY_ERROR = 1002;
    //新增数据失败
    public final static int CREATE_ERROR = 1003;
    //修改数据失败
    public final static int UPDATE_ERROR = 1004;
    //删除数据失败
    public final static int DELETE_ERROR = 1005;

    //缺少必需参数
    public final static int PARAMETER_NOT_ENOUGH = 10100;
    //参数错误
    public final static int PARAMETER_ERROR = 10101;
}
