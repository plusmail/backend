package kr.or.yi.controller;

import kr.or.yi.entity.Zone;
import kr.or.yi.repository.BoardRepository;
import kr.or.yi.repository.CafeRepository;
import kr.or.yi.repository.PowerlinkRepository;
import kr.or.yi.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user/*")
public class UserHomeController {
    @Autowired
    private CafeRepository cafeRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private PowerlinkRepository powerlinkRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String userHome(Module model, HttpSession session) throws Exception{

        return null;
    }
}
