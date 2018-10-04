package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String view(ModelMap model){
        Date currentTime=new Date();
        SimpleDateFormat myFormat=new SimpleDateFormat("HH:mm:ss");
        model.addAttribute("time",myFormat.format(currentTime));
        return "index";
    }

}
