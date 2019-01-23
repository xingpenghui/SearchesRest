package com.feri.searches.service;

import com.feri.searches.pojo.VideoES;
import com.feri.searches.vo.ResultVO;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/23 09:31
 */
public interface VideoESService {
    ResultVO save(VideoES videoES);
    ResultVO saveBatch(List<VideoES> videoES);
    ResultVO delete(int id);
    ResultVO searchLike(String name);
    ResultVO delBatch(List<Integer> ids);

}
