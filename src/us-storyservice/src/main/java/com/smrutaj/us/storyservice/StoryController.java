package com.smrutaj.us.storyservice;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping("/GetAllStoriesData")
    public List<StoryItem> getStoriesData() {
        return storyService.getStoriesData();
    }

    @PostMapping("/CreateStory")
    public String createStory(@RequestBody StoryItem storyItem) {
        return storyService.createStory(storyItem.getDate(), storyItem.getTitle(), storyItem.getImageUrl());
    }

    @GetMapping("/GetStoryById")
    public StoryItem getStoryById(@RequestParam String id) {
        return storyService.getStoryById(id);
    }

    @PutMapping("/UpdateStory")
    public String updateStory(@RequestBody StoryItem storyItem) {
        return storyService.updateStory(storyItem.getId(), storyItem.getDate(), storyItem.getTitle(), storyItem.getImageUrl());
    }
}
