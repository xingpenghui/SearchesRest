package com.feri.searches.dao;

import com.feri.searches.pojo.VideoES;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/23 09:30
 */
public interface VideoESDao extends ElasticsearchRepository<VideoES,Integer> {
    List<VideoES> queryByNameLike(String name);
}
