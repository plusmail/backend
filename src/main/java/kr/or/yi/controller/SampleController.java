package kr.or.yi.controller;

import kr.or.yi.entity.Cafe;
import kr.or.yi.repository.CafeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Controller
public class SampleController {
    @RequestMapping(value = "/main")
    public String main() {
        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/sample")
    public String exModel(Model model) {

        String data = "@ResponseBody 어노테이션을 통해 반환";
        return data;
    }
}
