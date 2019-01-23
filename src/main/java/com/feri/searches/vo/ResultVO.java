package com.feri.searches.vo;

import java.io.Serializable;

/**
 *@Author feri
 *@Date Created in 2019/1/15 09:43
 * 非分页查询结果集
 */
public class ResultVO implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    //一般都是新增或修改或删除操作
    public static ResultVO exec(int count,Object obj){
        ResultVO resultVO=new ResultVO();
        if(count>0){
            resultVO.setCode(1);
            resultVO.setMsg("操作成功");
            resultVO.setData(obj);
        }else{
            resultVO.setCode(1001);
            resultVO.setMsg("操作失败");
        }
        return resultVO;
    }
    public static ResultVO execOK(){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("OK");
        return resultVO;
    }
    public static ResultVO execERROR(){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1002);
        resultVO.setMsg("ERROR");
        return resultVO;
    }
    public static ResultVO execERROR(Object obj){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1002);
        resultVO.setMsg("ERROR");
        resultVO.setData(obj);
        return resultVO;
    }

    public static ResultVO execOK(Object obj){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("OK");
        resultVO.setData(obj);
        return resultVO;
    }
}
