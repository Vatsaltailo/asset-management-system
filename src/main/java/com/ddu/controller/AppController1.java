package com.ddu.controller;



import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddu.model.Allocation;
import com.ddu.model.Complain;
import com.ddu.model.Computer;
import com.ddu.model.FixedAsset;
import com.ddu.model.GenerateExcelComplain;
import com.ddu.model.GenerateExcelFixedAsset;
import com.ddu.model.GenerateExcelRecurring;
import com.ddu.model.OtherEquipment;
import com.ddu.model.Recurring;
import com.ddu.services.AllocationService;
import com.ddu.services.ComplainService;
import com.ddu.services.ComputerService;
import com.ddu.services.FixedAssetService;
import com.ddu.services.OtherEquipmentService;
import com.ddu.services.RecurringService;

@Controller
public class AppController1 {

	@Autowired
	private RecurringService recurringService;
	
	@Autowired
	private AllocationService allocationService;
	
	
	@Autowired
	private FixedAssetService fixedAssetService;
	
	@Autowired
	private ComputerService computerService;
	
	@Autowired
	private OtherEquipmentService otherEquipmentService;
	
	@Autowired
	private ComplainService complainService;
	
	@RequestMapping("/recurring")
	public String recurring(HttpServletRequest request)
	{
		request.setAttribute("mode", "recurring");
		return "adminwelcome";
	}
	
	@RequestMapping("/search")
	public String search(HttpServletRequest request)
	{
		request.setAttribute("mode", "search");
		return "adminwelcome";
	}
	
	@RequestMapping("/searchby")
	public String searchBy(HttpServletRequest request,Model model)
	{
		String search=request.getParameter("search");
		String location=request.getParameter("location");
		String type=request.getParameter("type");
		
		if("location".equals(search))
		{
			List<OtherEquipment> OE=otherEquipmentService.findlocation(location);	
			List<Computer> computer=computerService.findlocation(location);
			model.addAttribute("OE",OE);
			
			model.addAttribute("computer",computer);
			request.setAttribute("mode", "showsearch1");
		}
		else if("itemtype".equals(search))
		{
			if("Computer".equals(type))
			{
				List<Computer> computer=computerService.listall();
				model.addAttribute("computer",computer);
			}
			else 
			{
			List<OtherEquipment> OE=otherEquipmentService.findtype(type);
			
			System.out.println(OE);
			model.addAttribute("OE",OE);
			}
			request.setAttribute("mode", "showsearch2");
		}
		
		return "adminwelcome";
	}
	
	@GetMapping(value = "/downloadcomplains")
	public ResponseEntity<InputStreamResource> excelCustomersReport(@ModelAttribute Complain complain) throws IOException {
		List<Complain> users = (List<Complain>) complainService.listall();
		ByteArrayInputStream in = GenerateExcelComplain.usersToExcel(users);
		// return IO ByteArray(in);
		HttpHeaders headers = new HttpHeaders();
		// set filename in header
		headers.add("Content-Disposition", "attachment; filename=Complains.xlsx");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}

	@GetMapping(value = "/downloadFixedAsset")
	public ResponseEntity<InputStreamResource> excelCustomersReport(@ModelAttribute FixedAsset fixedasset) throws IOException {
		List<FixedAsset> users = (List<FixedAsset>) fixedAssetService.listall();
		ByteArrayInputStream in = GenerateExcelFixedAsset.usersToExcel(users);
		// return IO ByteArray(in);
		HttpHeaders headers = new HttpHeaders();
		// set filename in header
		headers.add("Content-Disposition", "attachment; filename=FixedAssets.xlsx");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}
	
	@GetMapping(value = "/downloadrecurring")
	public ResponseEntity<InputStreamResource> excelCustomersReport(@ModelAttribute Recurring recurring) throws IOException {
		List<Recurring> users = (List<Recurring>) recurringService.listall();
		ByteArrayInputStream in = GenerateExcelRecurring.usersToExcel(users);
		// return IO ByteArray(in);
		HttpHeaders headers = new HttpHeaders();
		// set filename in header
		headers.add("Content-Disposition", "attachment; filename=Recurring.xlsx");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}
	
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editComplain(@PathVariable(name="id")int id,HttpServletRequest request,Model model)
	{
		complainService.findcomplainid(id);
		List<Complain> complainlist=complainService.listall();
		model.addAttribute("complainlist",complainlist);
		//System.out.println(complainlist);
		request.setAttribute("mode", "showcomplain");
		return "adminwelcome";
		
	}

	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteFixedAsset(@PathVariable(name="id")int id,HttpServletRequest request,Model model)
	{
		fixedAssetService.delete(id);
		List<FixedAsset> fa=fixedAssetService.listall();
		model.addAttribute("fa",fa);
		request.setAttribute("mode", "showfixedasset");
		return "adminwelcome";
		
	}
	
	@RequestMapping(value="/deleter/{id}",method=RequestMethod.GET)
	public String deleterecurring(@PathVariable(name="id")int id,HttpServletRequest request,Model model)
	{
		recurringService.delete(id);
		List<Recurring> r=recurringService.listall();
		model.addAttribute("r",r);
		//System.out.println(complainlist);
		request.setAttribute("mode", "showrecurring");
		return "adminwelcome";

		
	}
	
	@RequestMapping("/fixedasset")
	public String fixedAsset(HttpServletRequest request)
	{
		request.setAttribute("mode", "fixedasset");
		return "adminwelcome";
	}
	@RequestMapping("/showassets")
	public String showassets(HttpServletRequest request,Model model)
	{
		List<FixedAsset> fa=fixedAssetService.listall();
		model.addAttribute("fa",fa);
		//System.out.println(complainlist);
		request.setAttribute("mode", "showfixedasset");
		return "adminwelcome";
	}
	
	@RequestMapping("/showrecurring")
	public String showrecurring(HttpServletRequest request,Model model)
	{
		List<Recurring> r=recurringService.listall();
		model.addAttribute("r",r);
		//System.out.println(complainlist);
		request.setAttribute("mode", "showrecurring");
		return "adminwelcome";
	}
	
	@PostMapping("/saverecurring")
	public String saveRecurring(@ModelAttribute Recurring recurring,BindingResult bindingResult,HttpServletRequest request)
	{
		String s=request.getParameter("total");
		int i=Integer.parseInt(s);
		recurring.setAvailable(i);
		String type=request.getParameter("type");
		recurring.setType(type);
		recurringService.save(recurring);
		request.setAttribute("mode", "welcome1");
		return "adminwelcome";
		
	}

	
	
	@PostMapping("/savefixedasset")
	public String savefixedasset(@ModelAttribute FixedAsset fixedasset,BindingResult bindingResult,HttpServletRequest request)
	{
		//String s=request.getParameter("savebill");
		//String s1=request.getParameter("save");
		String abc=request.getParameter("quantity");
		String location=request.getParameter("location");
		String type=request.getParameter("type");
		String description=request.getParameter("description");
		int quantity=Integer.parseInt(abc);
		
			
		fixedAssetService.save(fixedasset);
		
		int billid=fixedAssetService.find(fixedasset);
		System.out.println(billid);
			
		if("Computer".equals(type))
			{
				List<Computer> comp = new ArrayList<Computer>();
				 int i;
					for(i=0;i<quantity;i++)
					{
						comp.add(new Computer());
						
					}
					for (i=0;i<quantity;i++)
					{
						 String machineid="COM"+(i+1);
						//computer.setComid(i+1);
						comp.get(i).setMachineid(machineid);
						comp.get(i).setLocation(location);
						comp.get(i).setDescription(description);
						comp.get(i).setBillid(billid);
					}
					computerService.saveList(comp);
			}
			else
			{
				List<OtherEquipment> OE = new ArrayList<OtherEquipment>();
				 
					for(int i=0;i<quantity;i++)
					{
						OE.add(new OtherEquipment());
						
					}
					for(int i=0;i<quantity;i++)
					{
						//System.out.println(OE.get(i));
					}
					
					for(int k=0;k<quantity;k++)
					{
						
						OE.get(k).setType(type);
						int count=otherEquipmentService.find(type,location);
						OE.get(k).setLocation(location);
						OE.get(k).setDescription(description);
						OE.get(k).setLogicalid("FOT/IT/"+location+"/"+type+(count+k+1));
						OE.get(k).setBillid(billid);
						System.out.println(OE);
					}
					otherEquipmentService.saveList(OE);
			}
		
		request.setAttribute("mode", "welcome1");
		return "adminwelcome";
}
	
	@RequestMapping("/allocate")
	public String allocate(HttpServletRequest request)
	{
		request.setAttribute("mode", "allocate");
		return "adminwelcome";
	}
	
	@PostMapping("/saveAllocation")
	public String saveAllocation(@ModelAttribute Allocation allocation,BindingResult bindingResult,HttpServletRequest request)
	{
		String type=request.getParameter("type");
		if("Mouse".equals(type) || "Monitor".equals(type) || "CPU".equals(type) || "Keyboard".equals(type))
		{
			
		}
		else
		{
			allocation.setMachineid("NA");
		}
		//String location=request.getParameter("location");
		int billid=recurringService.find(type);
		if(billid != -99)
		{
			allocation.setBillid(billid);
			allocationService.save(allocation);
			request.setAttribute("mode", "welcome1");
			return "adminwelcome";
		}
		else
		{
			request.setAttribute("mode", "allocateerror");
			return "adminwelcome";	
		}
	}
	


}
