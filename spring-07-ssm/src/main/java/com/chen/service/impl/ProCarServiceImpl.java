package com.chen.service.impl;

import com.chen.mapper.ProCarMapper;
import com.chen.pojo.ProCar;
import com.chen.service.ProCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/09
 */
@Service
public class ProCarServiceImpl implements ProCarService {

    @Autowired
    private ProCarMapper proCarMapper;

    @Override
    public List<ProCar> listAllCar() {
        return proCarMapper.listAllCar();
    }
}
