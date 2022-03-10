package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "form1";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "processForm";
    }
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest req, Model model){

        String theName = req.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo! " + theName;

        model.addAttribute("message",result);
        return "processForm";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShout2(@RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();

        String result = "Yo hoooo! " + theName;

        model.addAttribute("message",result);
        return "processForm";
    }
}
