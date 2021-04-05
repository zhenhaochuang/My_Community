package com.nowcoder.community.service;

import com.nowcoder.community.dao.elasticsearch.DiscussPostRepository;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElasticsearchService {

    @Autowired
    private DiscussPostRepository discussPostRepository;

    public void saveDiscussPost(DiscussPost post){
        discussPostRepository.save(post);
    }

    public void deleteDiscussPost(int id){
        discussPostRepository.deleteById(id);
    }
}
