package kr.ac.kopo.controller;

import kr.ac.kopo.model.Food;
import kr.ac.kopo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/food") //food를 요청하면 내가 처리하겠다
public class FoodController {
    final String path = "food/";

    @Autowired
    FoodService service;

    @RequestMapping("/list") //list를 요청하면
    String list(Model model) {
        List<Food> list = service.list(); //List라는 상자에 <Food>를 담고 list라부르겠다

        model.addAttribute("list",list);

        return path + "list";
    }

    @RequestMapping("/delete")
    String delete(int foodNum) {
        service.delete(foodNum);

        return "redirect:list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET) //add를 하기 위한 페이지로 이동
    String add() {
        return path + "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    String add(Food item) { //
        service.add(item);

        return "redirect:list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    String update(int foodNum, Model model) {
        Food item = service.item(foodNum);

        model.addAttribute("item", item);

        return path + "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    String update(Food item) {
        service.update(item);

        return "redirect:list";
    }
}
