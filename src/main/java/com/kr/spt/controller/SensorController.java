package com.kr.spt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kr.spt.service.HubService;
import com.kr.spt.vo.CriteriaVO;
import com.kr.spt.vo.HubVO;

@Controller
@RequestMapping("/Sensor")
public class SensorController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	HubService hs;
	
	@RequestMapping(value="/getHubList", method=RequestMethod.GET)
	public @ResponseBody List<HubVO> list(CriteriaVO cri) throws Exception{
		
		log.info("---------------::>> List Method in GET");
		log.info("paramiter ::>>  ");
		log.info(cri.toString());
		
		List<HubVO> list = new ArrayList<HubVO>();
		list = hs.getList(cri);
		
		log.info("result data :>>");
		log.info(list.toString());
		return list;
	}
	
	@RequestMapping(value="/List", method=RequestMethod.POST)
	public @ResponseBody List<HubVO> List(CriteriaVO cri) throws Exception{
		
		log.info("---------------::>> List Method in");
		log.info("paramiter ::>>  ");
		log.info(cri.toString());
		
		List<HubVO> list = new ArrayList<HubVO>();
		list = hs.getList(cri);
		
		log.info("result data :>>");
		log.info(list.toString());
		return list;
	}
	
	@RequestMapping(value="/modifyHub", method=RequestMethod.GET)
	public @ResponseBody HubVO View(HubVO hvo) throws Exception{
		log.info("---------------::>> modifyHub Method in");
		HubVO viewHub = new HubVO();
		
		return viewHub;
	}
	
	
	
}
