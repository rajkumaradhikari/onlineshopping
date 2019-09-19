package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.codejava.model.Product;
import net.codejava.service.ProductService;

/*

@Controller
public class AppController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model)
	{
		List<Product> listProduct = service.listAll();
		model.addAttribute("listProduct",listProduct);
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductForm(Model model)
	{ 
		Product product = new Product();
		model.addAttribute("product",product);
		return "new_product";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product)
	{
		service.save(product);
		return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductForm(@PathVariable(name="id") Long id)
	{ 
		ModelAndView mv = new ModelAndView("edit_product");
		Product product = service.get(id);
		mv.addObject("product",product);
		return mv;
	}
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id") Long id)
	{
		service.delete(id);
		return "redirect:/";
	}

}
*/
@Controller
public class AppController
{
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model)
	{
		List<Product> listProduct = service.listAll();
		model.addAttribute("listProduct",listProduct);
		return "index";
	}
	@RequestMapping("/new")
	public String showNewProductForm(Model model)
	{
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
}























