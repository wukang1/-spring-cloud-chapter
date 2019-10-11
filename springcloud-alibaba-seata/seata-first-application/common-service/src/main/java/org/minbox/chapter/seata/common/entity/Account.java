package org.minbox.chapter.seata.openfeign.entity;

import com.gitee.hengboy.mybatis.enhance.common.annotation.Column;
import com.gitee.hengboy.mybatis.enhance.common.annotation.Id;
import com.gitee.hengboy.mybatis.enhance.common.annotation.Table;
import com.gitee.hengboy.mybatis.enhance.common.enums.KeyGeneratorTypeEnum;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 账户数据实体
 *
 * @author 恒宇少年
 */
@Data
@Table(name = "seata_account")
public class Account {

    @Column(name = "a_id")
    @Id(generatorType = KeyGeneratorTypeEnum.AUTO)
    private Integer id;

    @Column(name = "a_money")
    private Double money;

    @Column(name = "a_create_time")
    private Timestamp createTime;

    @Column(name = "a_mark")
    private String mark;
}
