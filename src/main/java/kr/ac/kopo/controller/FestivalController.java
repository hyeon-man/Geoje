package kr.ac.kopo.controller;

import kr.ac.kopo.model.Festival;
import kr.ac.kopo.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/festival")
public class FestivalController {

    final String path = "festival/";

    @Autowired
    FestivalService service;

    @RequestMapping("/list")
    String list(Model model) {
        List<Festival> list = service.list();

        model.addAttribute("list",list);

        return path + "list";
    }

    @RequestMapping("/delete")
    String delete(int festivalNum) {
        service.delete(festivalNum);

        return "redirect:list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    String add() {
        return path + "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    String add(Festival item) {
        service.add(item);

        return "redirect:list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    String update(int festivalNum, Model model) {
        Festival item = service.item(festivalNum);

        model.addAttribute("item", item);

        return path + "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    String update(Festival item) {
        service.update(item);

        return "redirect:list";
    }
}
