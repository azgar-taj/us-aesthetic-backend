package com.smrutaj.us.storyservice;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoryItemReposistory extends MongoRepository<StoryItem, String> {
    // Get All Stories
    public List<StoryItem> findAll();
}