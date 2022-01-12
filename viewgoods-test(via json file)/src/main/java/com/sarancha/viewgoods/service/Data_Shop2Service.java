package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.entity.Data_Shop1;
import com.sarancha.viewgoods.entity.Data_Shop2;
import com.sarancha.viewgoods.rest.GoodsRestNotSynchronizedWithDatabase;

public interface Data_Shop2Service {
    Data_Shop2 save(Data_Shop2 data_shop2);

    String copyDataFromRestToDataShop2(Data_Shop2 data_shop2, GoodsRestNotSynchronizedWithDatabase goodsRestNotSynchronizedWithDatabase);
}
