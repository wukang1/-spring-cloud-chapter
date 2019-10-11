package org.minbox.chapter.seata;

import org.minbox.chapter.seata.openfeign.GoodClient;
import org.minbox.chapter.seata.common.entity.Good;
import org.minbox.chapter.seata.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 恒宇少年
 */
@RestController
public class GoodController implements GoodClient {

    @Autowired
    private GoodService goodService;

    @Override
    public Good findById(Integer goodId) {
        return goodService.findById(goodId);
    }

    @Override
    public void reduceStock(Integer goodId, int stock) {
        goodService.reduceStock(goodId, stock);
    }
}
