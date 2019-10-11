package org.minbox.chapter.seata.common.entity;

import com.gitee.hengboy.mybatis.enhance.common.annotation.Column;
import com.gitee.hengboy.mybatis.enhance.common.annotation.Id;
import com.gitee.hengboy.mybatis.enhance.common.annotation.Table;
import com.gitee.hengboy.mybatis.enhance.common.enums.KeyGeneratorTypeEnum;
import lombok.Data;

/**
 * @author 恒宇少年
 */
@Data
@Table(name = "seata_order")
public class Order {

    @Id(generatorType = KeyGeneratorTypeEnum.AUTO)
    @Column(name = "o_id")
    private Integer id;

    @Column(name = "o_good_id")
    private Integer goodId;

    @Column(name = "o_account_id")
    private Integer accountId;

    @Column(name = "o_price")
    private Double price;
}
