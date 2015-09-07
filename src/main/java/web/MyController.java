package web;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
    // Here is not RestController
public class MyController {
	
	@RequestMapping("/")
	String index() {
		return "index";
	}


        @RequestMapping("/domain")
        String abc_domain(){
                return "/domain";
        }

        @RequestMapping("/tax")
        String abc_tax(){
                return "/tax";
        }
	
        @RequestMapping("/area")
        String abc_area(){
                return "/area";
        }

        @RequestMapping("/circle")
        String abc_circle(){
                return "/circle";
        }

        @RequestMapping("/zipcode")
        String abc_zipcode(){
                return "/zipcode";
        }

	@RequestMapping("/jsp")
	String jsp() {
		return "index-jsp";
	}
}
