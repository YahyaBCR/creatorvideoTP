package ma.xproce.inventoryserviceyahya.web.controllers;

import ma.xproce.inventoryserviceyahya.entities.Video;
import ma.xproce.inventoryserviceyahya.services.VideoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VideoController {
    @Autowired
    private VideoManager videoManager;


    @GetMapping("/listVideos")
    public String listVideosAction(Model model){
        List<Video> videoList = videoManager.getAllVideos();
        model.addAttribute("videoList",videoList);
        return "listVideos";
    }
}
