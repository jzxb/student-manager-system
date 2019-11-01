package com.suixingpay.student.constants;

/**
 * @author lhx
 * @date 2019/11/1 - 16:01
 */
public interface ExceptionConstants {
    //初始化异常以10开头
    String DAO_INIT_ERROR_CODE = "100001";

    //数据库操执行结果异常以20开头
    String DAO_ADD_RESULT_ERROR_CODE = "200001";
    String DAO_UPDATE_RESULT_ERROR_CODE = "200002";

    //数据库操作异常以30开头
    String DAO_ADD_HANDLE_ERROR_CODE = "300001";
    String DAO_UPDATE_HANDLE_ERROR_CODE = "300002";

    //参数相关异常以40开头
    String ILLEGAL_ARGUMENT_NULL_ERROR_CODE = "400001";

    //业务相关异常以A0开头
    //没有传ID参数
    String APP_NO_ID_PARAMS_RECORD_CODE = "A00001";
}
