package intro.introme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IntroController {
    @GetMapping("introduce")
    public String intro(@RequestParam("name") String name, Model model) {
        model.addAttribute("data", "MYSELF");
        model.addAttribute("name", name);
        return "intro";
    }


}
