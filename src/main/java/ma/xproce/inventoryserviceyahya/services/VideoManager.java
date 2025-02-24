package ma.xproce.inventoryserviceyahya.services;

import ma.xproce.inventoryserviceyahya.entities.Video;

import java.util.List;

public interface VideoManager {
    public Video addVideo(Video video);
    public boolean deleteVideo(Video video);
    public boolean deleteVideoByID(Integer id);
    public Video updateVideo(Video video);

    public List<Video> getAllVideos();
}
