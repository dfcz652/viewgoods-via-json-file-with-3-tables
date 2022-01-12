package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.entity.Data_Shop1;
import com.sarancha.viewgoods.rest.GoodsRestNotSynchronizedWithDatabase;

public interface Data_Shop1Service {
    Data_Shop1 save(Data_Shop1 data_shop1);

    String copyDataFromRestToDataShop1(Data_Shop1 data_shop1, GoodsRestNotSynchronizedWithDatabase goodsRestNotSynchronizedWithDatabase);

}
