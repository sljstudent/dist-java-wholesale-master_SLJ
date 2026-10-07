package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repository.WholesaleOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WholesaleOrderServiceImpl implements WholesaleOrderService {
    private final WholesaleOrderRepository wholesaleOrderRepository;

    public WholesaleOrderServiceImpl(
            WholesaleOrderRepository wholesaleOrderRepository) {
        this.wholesaleOrderRepository = wholesaleOrderRepository;
    }

    @Override
    public List<WholesaleOrder> findAll() {
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleOrderRepository.findAll().forEach(list::add);
        return list;
    }
}
