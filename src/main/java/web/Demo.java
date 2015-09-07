package web;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

@Controller
public class Demo {
	
	@RequestMapping("/balance")
	String balance() {
		return "balance";
	}
	
	@RequestMapping("/calculate")
	String calculate(double balance, Model model) {
		double result = balance * 1.25 / 100;
		model.addAttribute("result", result);
		return "interest";
	}

	@RequestMapping("/circle-result")
	String circle(double radius1, Model model) {
		double result1 = 2*Math.PI*radius1;
		double result2 = Math.PI*Math.pow(radius1,2);
		model.addAttribute("input1", radius1);
		model.addAttribute("result1", result1);
		model.addAttribute("result2", result2);
		return "/circle-result";
	}

	@RequestMapping("/tax-result")
	String tax(double price, Model model) {
		double result = price*7/100;
		model.addAttribute("price1", price);
		model.addAttribute("tax1", result);
		return "/tax-result";
	}

	@RequestMapping("/zipcode-result")
	String get_zipcode(String ampher1, Model model) {
		String zipcode1="99999";     // zip code

                if ( ampher1.equals( "เมืองนนทบุรี" )){ zipcode1="11000"; }
                if ( ampher1.equals( "บางบัวทอง" )){ zipcode1="11110"; }
                if ( ampher1.equals( "ปากเกร็ด" )){ zipcode1="11120"; }
                if ( ampher1.equals( "บางกรวย" )){ zipcode1="11130"; }
                if ( ampher1.equals( "บางใหญ่" )){ zipcode1="11140"; }
                if ( ampher1.equals( "ไทรน้อย" )){ zipcode1="11150"; }

		model.addAttribute("input1", ampher1);
		model.addAttribute("result1", zipcode1);
		return "/zipcode-result";
	}

        @RequestMapping("/area-result")
        String xyz( double width, double height, Model model){
            double result=width*height;
            model.addAttribute("input1", width);
            model.addAttribute("input2", height);
            model.addAttribute("result", result);
            return "area-result";
        }

        @RequestMapping("/domain-result")
        String xyz_domain_result( String domain_name, Model model){

            InetAddress ipadd;
            try{
                 ipadd=InetAddress.getByName(domain_name);
            } catch(UnknownHostException e){
                throw new RuntimeException(e);
            }
            model.addAttribute("domain1", domain_name);
            model.addAttribute("ipadd", ipadd );
            return "domain-result";
        }

}
