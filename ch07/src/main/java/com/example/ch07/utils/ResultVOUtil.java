package com.example.ch07.utils;

import com.example.ch07.vo.ResultVO;

/**
 * 类名：ResultVOUtil
 * 描述：TODO
 * 时间：2018/2/11 15:31
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
