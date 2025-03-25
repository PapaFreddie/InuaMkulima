package com.inuaMkulima.inuaMkulima.service;

import com.papafred.FullstackBackend.exception.ResourceNotFoundException;
import com.inuaMkulima.inuaMkulima.entity.FarmerTransaction;
import com.inuaMkulima.inuaMkulima.entity.Products;
import com.inuaMkulima.inuaMkulima.repository.FarmerTransactionRepository;

@Service
public class FarmerTransactionServiceImpl implements FarmerTransactionService{

    @Autowired
    private FarmerTransactionRepository farmerTransactionRepository;


    public FarmerTransaction addTransaction(FarmerTransaction farmerTransaction) {
        return farmerTransactionRepository.save(farmerTransaction);
    }


    public FarmerTransaction findById(Long id){
        FarmerTransaction farmerTransaction =farmerTransactionRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Farmer with id dont exist:"+ id));
        return farmerTransaction.getId();
    }

}
