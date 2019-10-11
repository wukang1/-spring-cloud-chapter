package org.minbox.chapter.seata.openfeign;

import org.minbox.chapter.seata.common.entity.Good;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品服务接口定义
 *
 * @author 恒宇少年
 */
@FeignClient(name = "good-service")
@RequestMapping(value = "/good")
public interface GoodClient {
    /**
     * 查询商品基本信息
     *
     * @param goodId {@link Good#getId()}
     * @return {@link Good}
     */
    @GetMapping
    Good findById(@RequestParam("goodId") Integer goodId);

    /**
     * 减少商品的库存
     *
     * @param goodId {@link Good#getId()}
     * @param stock  减少库存的数量
     */
    @PostMapping
    void reduceStock(@RequestParam("goodId") Integer goodId, @RequestParam("stock") int stock);
}
