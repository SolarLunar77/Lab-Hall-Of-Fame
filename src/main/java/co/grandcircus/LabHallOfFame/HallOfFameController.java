package co.grandcircus.LabHallOfFame;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.LabHallOfFame.entity.Innovator;
import co.grandcircus.LabHallOfFame.entity.Inventor;
import co.grandcircus.LabHallOfFame.service.ApiService;

@Controller
public class HallOfFameController {
	
	@Autowired
	ApiService apiService;
		
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		
		List<Inventor> inventors = apiService.getPeople();
		
		mv.addObject("list", inventors);
		
		return mv;
	}
	
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		ModelAndView mv = new ModelAndView("complete");
		
		List<Innovator> innovators = apiService.getMakers();
		
		Collections.sort(innovators);
		Collections.reverse(innovators);

		return new ModelAndView("complete", "list", innovators);
	}

}
