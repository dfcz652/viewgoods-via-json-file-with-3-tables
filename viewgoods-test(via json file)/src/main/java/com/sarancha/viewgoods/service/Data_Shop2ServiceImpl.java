package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.dao.Data_Shop2Dao;

import com.sarancha.viewgoods.entity.Data_Shop1;
import com.sarancha.viewgoods.entity.Data_Shop2;

import com.sarancha.viewgoods.rest.GoodsRestNotSynchronizedWithDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_Shop2ServiceImpl implements Data_Shop2Service {

    @Autowired
    private Data_Shop2Dao data_shop2Dao;

    @Override
    public Data_Shop2 save(Data_Shop2 data_shop2) {
        return data_shop2Dao.save(data_shop2);
    }

    @Override
    public String copyDataFromRestToDataShop2(Data_Shop2 data_shop2, GoodsRestNotSynchronizedWithDatabase goodsRestNotSynchronizedWithDatabase) {
        data_shop2.setShop_id(goodsRestNotSynchronizedWithDatabase.getShop_id());
        data_shop2.setPrice(goodsRestNotSynchronizedWithDatabase.getPrice());
        data_shop2.setRemnant(goodsRestNotSynchronizedWithDatabase.getRemnant());

        return "OK";
    }
}
