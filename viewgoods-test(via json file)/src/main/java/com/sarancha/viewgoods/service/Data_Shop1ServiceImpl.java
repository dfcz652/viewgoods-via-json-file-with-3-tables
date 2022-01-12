package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.dao.Data_Shop1Dao;

import com.sarancha.viewgoods.entity.Data_Shop1;

import com.sarancha.viewgoods.rest.GoodsRestNotSynchronizedWithDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_Shop1ServiceImpl implements Data_Shop1Service {

    @Autowired
    private Data_Shop1Dao data_shop1Dao;

    @Override
    public Data_Shop1 save(Data_Shop1 data_shop1) {
        return data_shop1Dao.save(data_shop1);
    }

    @Override
    public String copyDataFromRestToDataShop1(Data_Shop1 data_shop1, GoodsRestNotSynchronizedWithDatabase goodsRestNotSynchronizedWithDatabase) {
        data_shop1.setShop_id(goodsRestNotSynchronizedWithDatabase.getShop_id());
        data_shop1.setPrice(goodsRestNotSynchronizedWithDatabase.getPrice());
        data_shop1.setRemnant(goodsRestNotSynchronizedWithDatabase.getRemnant());

        return "OK";
    }
}
