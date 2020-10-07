package controller_psh_56;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_psh_56 {
	
	// I ,Parham, found another configuration to run springMVC. In my approach, if you run the project it is going to redirect you to index.jsp 
	// where a button is displayed. When you click on the button you are going to be redirected to another page with our description on it.
	
	@RequestMapping("/submitButton")
	public ModelAndView descriptionPage() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("View.jsp");
		return mv;
	}
}
