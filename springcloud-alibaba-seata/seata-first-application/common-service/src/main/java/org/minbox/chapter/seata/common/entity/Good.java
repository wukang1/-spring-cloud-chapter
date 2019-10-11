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
@Table(name = "seata_good")
public class Good {

    @Id(generatorType = KeyGeneratorTypeEnum.AUTO)
    @Column(name = "g_id")
    private Integer id;

    @Column(name = "g_name")
    private String name;

    @Column(name = "g_stock")
    private Integer stock;

    @Column(name = "g_price")
    private Double price;
}
