package com.feri.searches.provider;

import com.feri.searches.dao.VideoESDao;
import com.feri.searches.pojo.VideoES;
import com.feri.searches.service.VideoESService;
import com.feri.searches.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/23 09:36
 */
@Service
public class VideoESProvider implements VideoESService {
    @Autowired
    private VideoESDao dao;
    @Override
    public ResultVO save(VideoES videoES) {
         dao.save(videoES);
         return ResultVO.execOK();
    }

    @Override
    public ResultVO saveBatch(List<VideoES> videoES) {
        for(VideoES v:videoES){
            dao.save(v);
        }
        //dao.saveAll(videoES.)
        return ResultVO.execOK();
    }

    @Override
    public ResultVO delete(int id) {
        dao.deleteById(id);
        return ResultVO.execOK();
    }

    @Override
    public ResultVO searchLike(String name) {
        return ResultVO.execOK(dao.queryByNameLike(name));
    }

    @Override
    public ResultVO delBatch(List<Integer> ids) {
        for(Integer id:ids){
            dao.deleteById(id);
        }
        return ResultVO.execOK();
    }
}
