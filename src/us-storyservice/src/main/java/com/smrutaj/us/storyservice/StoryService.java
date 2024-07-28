package com.smrutaj.us.storyservice;

import java.util.logging.Logger;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StoryService {
    private static final Logger LOGGER = Logger.getLogger(StoryService.class.getName());

    @Autowired
    private StoryItemReposistory storyItemRepo;

    public List<StoryItem> getStoriesData() {
        LOGGER.info("Fetching stories data");
        return storyItemRepo.findAll();
    }

    public String createStory(String date, String title, String imageUrl) {
        LOGGER.info("Creating story");
        StoryItem storyItem = new StoryItem(date, title, imageUrl);
        storyItemRepo.save(storyItem);
        return storyItem.getId();
    }

    public StoryItem getStoryById(String id) {
        LOGGER.info("Fetching story by ID: " + id);
        return storyItemRepo.findById(id).get();
    }

    public String updateStory(String id, String date, String title, String imageUrl) {
        LOGGER.info("Updating story with ID: " + id);
        StoryItem storyItem = storyItemRepo.findById(id).get();
        storyItem.setDate(date);
        storyItem.setTitle(title);
        storyItem.setImageUrl(imageUrl);
        storyItemRepo.save(storyItem);
        return "Story updated";
    }
}