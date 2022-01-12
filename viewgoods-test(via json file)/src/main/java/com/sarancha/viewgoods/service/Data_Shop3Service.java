package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.entity.Data_Shop2;
import com.sarancha.viewgoods.entity.Data_Shop3;
import com.sarancha.viewgoods.rest.GoodsRestNotSynchronizedWithDatabase;

public interface Data_Shop3Service {
    Data_Shop3 save(Data_Shop3 data_shop3);

    String copyDataFromRestToDataShop3(Data_Shop3 data_shop3, GoodsRestNotSynchronizedWithDatabase goodsRestNotSynchronizedWithDatabase);
}
