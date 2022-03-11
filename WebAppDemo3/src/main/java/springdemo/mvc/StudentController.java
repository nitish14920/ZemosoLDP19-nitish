package springdemo.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student student = new Student();

        model.addAttribute("student",student );

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult){

        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());

        if(bindingResult.hasErrors()){
            return "student-form";
        }
        else {
            return "student-confirmation";
        }
    }
}
