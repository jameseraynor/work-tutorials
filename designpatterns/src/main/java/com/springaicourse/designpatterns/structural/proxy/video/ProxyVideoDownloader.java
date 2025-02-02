package com.springaicourse.designpatterns.structural.proxy.video;

import java.util.HashMap;
import java.util.Map;

/**
 * ProxyVideoDownloader implements the Proxy design pattern for video downloading
 * The Proxy pattern provides a surrogate or placeholder for another object to control access to it
 * In this case, it acts as a caching proxy to avoid expensive video downloads
 */
public class ProxyVideoDownloader implements VideoDownloader {

    // Cache to store downloaded videos, avoiding repeated downloads
    private final Map<String, Video> videoCache = new HashMap<>();

    // Reference to the real video downloader that does the actual work
    private final VideoDownloader downloader = new RealVideoDownloader();

    /**
     * Gets a video by name, using caching to optimize performance
     * This is where the proxy intercepts the call to the real downloader
     *
     * @param videoName Name of the video to retrieve
     * @return Video object either from cache or downloaded fresh
     */
    @Override
    public Video getVideo(String videoName) {
        // Check if video exists in cache
        if (!videoCache.containsKey(videoName)) {
            // If not in cache, download it using real downloader and cache it
            videoCache.put(videoName, downloader.getVideo(videoName));
        }
        System.out.println("Retrieving video from cache...");
        System.out.println("-----------------------");
        // Return cached video
        return videoCache.get(videoName);
    }

}