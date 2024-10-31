package com.hysea.growth.standard.service;

import com.hysea.growth.standard.domain.entity.GrowthStandard;

import java.util.List;

public interface GrowthStandardService {

    List<GrowthStandard> list();

    void save(GrowthStandard growthStandard);

}
