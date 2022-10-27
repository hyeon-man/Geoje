package kr.ac.kopo.controller;

import kr.ac.kopo.model.Tour;
import kr.ac.kopo.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/tour")
public class TourController {
    final String path = "tour/";

    @Autowired
    TourService service;

    @RequestMapping("/list")
    String list(Model model) {
        List<Tour> list = service.list();

        model.addAttribute("list",list);

        return path + "list";
    }

    @RequestMapping("/delete")
    String delete(int tourNum) {
        service.delete(tourNum);

        return "redirect:list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    String add() {
        return path + "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    String add(Tour item) {
        service.add(item);

        return "redirect:list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    String update(int tourNum, Model model) {
        Tour item = service.item(tourNum);

        model.addAttribute("item", item);

        return path + "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    String update(Tour item) {
        service.update(item);

        return "redirect:list";
    }
}
