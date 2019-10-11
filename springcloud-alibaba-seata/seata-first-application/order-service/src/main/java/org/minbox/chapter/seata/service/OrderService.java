package org.minbox.chapter.seata.service;

import com.gitee.hengboy.mybatis.enhance.mapper.EnhanceMapper;
import org.minbox.chapter.seata.common.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 恒宇少年
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderService {

    @Autowired
    private EnhanceMapper<Order, Integer> mapper;

    public void addOrder(Order order) {
        mapper.insert(order);
    }
}
