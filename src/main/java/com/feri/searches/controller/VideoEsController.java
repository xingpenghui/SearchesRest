package com.feri.searches.controller;

import com.feri.searches.pojo.VideoES;
import com.feri.searches.service.VideoESService;
import com.feri.searches.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/23 09:42
 */
@Api(value = "主页的搜索",tags = "主页搜索相关操作")
@RestController
public class VideoEsController {
    @Autowired
    private VideoESService service;

    //新增
    @ApiOperation(value = "新增或修改",notes= "实现SelfCoding主页搜索内容的更新")
    @PostMapping("videoessave.do")
    public ResultVO save(@RequestBody VideoES videoES){
        return service.save(videoES);
    }
    //批量新增
    @ApiOperation(value = "批量新增或修改",notes= "实现SelfCoding主页搜索内容的更新")
    @PostMapping("videoessavebatch.do")
    public ResultVO savebatch(@RequestBody List<VideoES> list){
        return service.saveBatch(list);
    }
    //删除
    @ApiOperation(value = "删除",notes= "实现SelfCoding主页搜索内容的删除")
    @DeleteMapping("videoesdel.do")
    public ResultVO del(int id){
        return service.delete(id);
    }
    //批量删除
    @ApiOperation(value = "批量删除",notes= "实现SelfCoding主页搜索内容的批量删除")
    @DeleteMapping("videoesdelbatch.do")
    public ResultVO del(@RequestBody List<Integer> ids){
        return service.delBatch(ids);
    }
    //模糊查询
    @ApiOperation(value = "模糊查询",notes= "实现SelfCoding主页搜索框的搜索")
    @GetMapping(value = "videoeslike.do",params = {"name"})
    public ResultVO like(String name){
        if(name!=null && name.length()>0) {
            return service.searchLike(name);
        }else {
            return ResultVO.execERROR();
        }

    }
}
