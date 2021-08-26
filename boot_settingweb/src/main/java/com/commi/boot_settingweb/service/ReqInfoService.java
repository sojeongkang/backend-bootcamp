package com.commi.boot_settingweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commi.boot_settingweb.mapper.ReqInfoMapper;
import com.commi.boot_settingweb.vo.RequestInfoVO;


@Service
public class ReqInfoService {

	@Autowired
	private ReqInfoMapper reqInfoMapper;
	
	public List<RequestInfoVO> selectLCByYear(String yy) throws Exception {
		return reqInfoMapper.selectLCByYear(yy);
	}

}