package kr.ac.kopo.controller;

import kr.ac.kopo.model.Member;
import kr.ac.kopo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    final String path = "member/";

    @Autowired
    MemberService service;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Member> list = service.list();

        model.addAttribute("list", list);

        return path + "list";
    }

    @GetMapping("/add")
    public String add() {
        return path + "add";
    }

    @PostMapping("/add")
    public String add(Member item) {
        service.add(item);

        return "redirect:list";
    }

    @RequestMapping("/delete")
    String delete(String memberId) {
        service.delete(memberId);

        return "redirect:list";
    }
}
