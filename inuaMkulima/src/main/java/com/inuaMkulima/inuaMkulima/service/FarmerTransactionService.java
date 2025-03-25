package com.inuaMkulima.inuaMkulima.service;

import com.inuaMkulima.inuaMkulima.entity.FarmerTransaction;
import com.inuaMkulima.inuaMkulima.entity.Products;

public interface FarmerTransactionService {
    public FarmerTransaction addTransaction(FarmerTransaction farmerTransaction);
    FarmerTransaction getById(Long id);


}
