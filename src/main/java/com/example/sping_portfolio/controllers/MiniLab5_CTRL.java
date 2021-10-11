package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.Image.ImageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MiniLab5_CTRL {
    @GetMapping("/MiniLab5")
    public String image(Model model) {
        String web_server = "http://localhost:8080";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/Mona_Lisa_RE.png";
        lii.add(new ImageInfo(file0, web_server + file0, 12));
        lii.get(0).read_image();

        String file1 = "/images/calvinbackhurts.png";
        lii.add(new ImageInfo(file1, web_server + file1, 2));
        lii.get(1).read_image();

        String file2 = "/images/whereisthetwix.png";
        lii.add(new ImageInfo(file2, web_server + file2, 12));
        lii.get(2).read_image();

        String file0 = "/images/Mona_Lisa_RE.png";
        lii.add(new ImageInfo(file0, web_server + file0, 12));
        lii.get(0).read_image();

        model.addAttribute("lii", lii);
        return "/MiniLab5/MiniLab5";
    }

    @GetMapping("/MiniLab5/image_grayscale")
    public String image_grayscale(Model model) {
        String web_server = "http://localhost:8080";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/whereisthetwix.png";
        lii.add(new ImageInfo(file0, web_server + file0, 12));
        lii.get(0).read_image();

        String file1 = "/images/calvinbackhurts.png";
        lii.add(new ImageInfo(file1, web_server + file1, 12));
        lii.get(1).read_image();

        String file2 = "/images/Mona_Lisa.png";
        lii.add(new ImageInfo(file2, web_server + file2, 12));
        lii.get(2).read_image();

        model.addAttribute("lii", lii);
        return "/MiniLab5/image_grayscale";
    }
}