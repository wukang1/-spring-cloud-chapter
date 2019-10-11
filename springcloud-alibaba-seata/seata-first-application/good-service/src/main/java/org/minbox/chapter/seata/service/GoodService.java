package org.minbox.chapter.seata.service;

import com.gitee.hengboy.mybatis.enhance.mapper.EnhanceMapper;
import org.minbox.chapter.seata.common.entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

/**
 * @author 恒宇少年
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodService {

    @Autowired
    private EnhanceMapper<Good, Integer> mapper;

    /**
     * 查询商品详情
     *
     * @param goodId {@link Good#getId()}
     * @return {@link Good}
     */
    public Good findById(Integer goodId) {
        return mapper.selectOne(goodId);
    }

    /**
     * 扣除商品库存
     *
     * @param goodId {@link Good#getId()}
     * @param stock  扣除的库存数量
     */
    public void reduceStock(Integer goodId, int stock) {
        Good good = mapper.selectOne(goodId);
        if (ObjectUtils.isEmpty(good)) {
            throw new RuntimeException("商品：" + goodId + ",不存在.");
        }
        if (good.getStock() - stock < 0) {
            throw new RuntimeException("商品：" + goodId + "库存不足.");
        }
        good.setStock(good.getStock() - stock);
        mapper.update(good);

    }
}
