package com.hysea.growth.standard.service.impl;

import com.hysea.growth.standard.dao.GrowthStandardDao;
import com.hysea.growth.standard.domain.entity.GrowthStandard;
import com.hysea.growth.standard.service.GrowthStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrowthStandardServiceImpl implements GrowthStandardService {

    @Autowired
    GrowthStandardDao growthStandardDao;

    @Override
    public List<GrowthStandard> list() {
        return growthStandardDao.list();
    }

    @Override
    public void save(GrowthStandard growthStandard) {
        growthStandardDao.save(growthStandard);
    }
}
