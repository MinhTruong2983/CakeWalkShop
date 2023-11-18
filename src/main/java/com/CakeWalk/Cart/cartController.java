package com.CakeWalk.Cart;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.CakeWalk.Dao.CakesDao;
import com.CakeWalk.Dao.OrdersDao;
import com.CakeWalk.Dao.OrdersDetailDao;
import com.CakeWalk.Entity.Cakes;
import com.CakeWalk.Service.SessionService;





@Controller
public class cartController {
 
	@Autowired
	SessionService service;
	
	@Autowired 
	OrdersDetailDao detailDao;
	
	
	@Autowired
	OrderRequestDTO dto;
	
	@Autowired
	OrdersDao orderDao;
	
	@Autowired
	CakesDao cakesDao ;
	
	
	
	// 
	      // lấy id của sản phẩm vừa click vào để thêm vào giỏ hàng 
	 @GetMapping("/home/addcart/{cakeid}")
	    public String addToCart(@PathVariable int cakeid,@RequestParam(value = "quantity", defaultValue = "1") int quantity ) {
		 //tạo và tìm kiếm cake có id tương tự  đường dẫn
		 Cakes cakes = cakesDao.getById(cakeid);
	        System.out.println(cakes); 
		  // Tạo một CartItem và thêm vào giỏ hàng
	        itemCart cartItem = new itemCart();
	        cartItem.setId(cakes.getCakeid());
	        cartItem.setName(cakes.getName());
	        cartItem.setPrice(cakes.getPrice());

	        cartItem.setQty(quantity);
	        cartItem.setImage(cakes.getImage());
	        cartItem.setCakes(cakes);
	       // Lấy giỏ hàng từ phiên làm việc của người dùng và thêm sản phẩm vào đó
	        cart cart = service.get("cart"); 
	        if (cart == null) {
	            cart = new cart();
	            service.set("cart", cart);
	        }
	        cart.addItem(cartItem);
	        // Chuyển hướng người dùng đến trang giỏ hàng
	        return "redirect:/home/product";
	    }

	 
	   // hien thi gio hang 
		@GetMapping("/home/cart")
	    public String viewCart(Model model , OrderRequestDTO dto) {
	        // Lấy giỏ hàng từ phiên làm việc của người dùng và hiển thị nó trên trang web
	        cart cart = service.get("cart");
	    if (cart != null && !cart.getItems().isEmpty()) {
	        // Tính tổng số tiền trong giỏ hàng
	        BigDecimal totalAmount = BigDecimal.ZERO;
	        for (itemCart item : cart.getItems()) {
	            if (item != null) {
	                BigDecimal itemTotal = item.getPrice().multiply(BigDecimal.valueOf(item.getQty()));
	                totalAmount = totalAmount.add(itemTotal);
	            }
	        }	       
	        // Đặt tổng số tiền vào model để hiển thị trên trang JSP
	        model.addAttribute("totalAmount", totalAmount);
            System.out.println(cart.toString());
	        model.addAttribute("cart", cart.getItems());        
		}
	        model.addAttribute("khachhang",dto);
	        return "/cart/cart";    
	    }
		
	
	        
	    
		
	        
	
		
		
		
		
		
	 
	 
	
	
}
