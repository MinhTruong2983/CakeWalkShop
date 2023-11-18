package com.CakeWalk.Controlller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CakeWalk.Dao.CakesDao;
import com.CakeWalk.Entity.Cakes;
import com.CakeWalk.Service.SessionService;

@Controller
public class product {

	@Autowired
	CakesDao cakesDao;
	
	@Autowired
   SessionService session;
	
	// trang sản phẩm 
//		@GetMapping("/home/product")
//		private String products(Model model) {
//			
//        List<Cakes> list = cakesDao.findAll();
//        model.addAttribute("cakeList", list);
//        list.forEach(
//        		s -> {
//        			System.out.println(s.getCakeid());
//        			System.out.println(s.getName());
//        			System.out.println(s.getPrice());
//        			System.out.println(s.getQuantity());
//        			System.out.println(s.getDescription());
//        			System.out.println(s.getImage());
//        		}
//        		);
//
//			return "/products/product";
//		}
//		
//		
		   @GetMapping("/home/product")
			public String search_list(Model model, @RequestParam("name") Optional<String> name, @RequestParam("p") Optional<Integer> p) {
				String na = name.orElse(session.get("name",""));
				session.set("name", na);	
			    int pageNumber = p.orElse(0); 
			    PageRequest pageRequest = PageRequest.of(pageNumber, 4);
				model.addAttribute("page", cakesDao.findAllByNameLike("%"+na+"%", pageRequest));
				System.out.println("Value of 'page': " + model.getAttribute("page"));

				 return "products/product";
			}
	
	
}
