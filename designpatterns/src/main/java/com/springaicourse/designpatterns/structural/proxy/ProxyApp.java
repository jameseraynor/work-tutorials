package com.springaicourse.designpatterns.structural.proxy;

import com.springaicourse.designpatterns.structural.proxy.internet.Internet;
import com.springaicourse.designpatterns.structural.proxy.internet.ProxyInternet;
import com.springaicourse.designpatterns.structural.proxy.video.ProxyVideoDownloader;
import com.springaicourse.designpatterns.structural.proxy.video.VideoDownloader;

/**
 * This class demonstrates the Proxy design pattern implementation
 * The Proxy pattern provides a surrogate or placeholder for another object to control access to it
 *
 * The Proxy design pattern allows us to create a surrogate or placeholder for another object,
 * which can be used as an alternative to the real object. This surrogate object controls access
 * to the real object, allowing it to perform additional operations before or after delegating
 * the request to the real object. This pattern is useful when we want to add additional
 * functionality to an existing object without modifying its code.
 *
 * use when:
 * - when we want to provide a level of indirection to the object
 * - when we want to add additional functionality to an existing object without modifying its code
 * - when we want to control access to the real object
 *
 *
 */
public class ProxyApp {
    public static void main(String[] args) {

        // Example 1: Internet Proxy
        // ProxyInternet acts as a protective proxy that controls access to the real Internet object
        // It can perform access control, logging, or filtering before allowing the actual connection
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");  // Allowed site
        internet.connectTo("banned.com");  // Blocked site

        System.out.println("==========================================");

        // Example 2: Video Downloader Proxy
        // ProxyVideoDownloader acts as a caching proxy that stores previously downloaded videos
        // This improves performance by avoiding redundant downloads of the same video
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");     // First request - will be downloaded
        videoDownloader.getVideo("geekific");     // Cached - returns from cache
        videoDownloader.getVideo("likeNsub");     // First request - will be downloaded
        videoDownloader.getVideo("likeNsub");     // Cached - returns from cache
        videoDownloader.getVideo("geekific");     // Cached - returns from cache

    }
}