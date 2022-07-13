package com.dongqiao.dianping.service;

import com.dongqiao.dianping.common.BusinessException;
import com.dongqiao.dianping.model.SellerModel;

import java.util.List;

public interface SellerService {

    SellerModel create(SellerModel sellerModel);

    SellerModel get(Integer id);

    List<SellerModel> selectAll();

    SellerModel changeStatus(Integer id,Integer disabledFlag) throws BusinessException;

    Integer countAllSeller();

}
