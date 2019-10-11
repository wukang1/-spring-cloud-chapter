package org.minbox.chapter.seata.service;

import com.gitee.hengboy.mybatis.enhance.mapper.EnhanceMapper;
import org.minbox.chapter.seata.common.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

/**
 * 账户业务逻辑处理
 *
 * @author 恒宇少年
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountService {
    @Autowired
    private EnhanceMapper<Account, Integer> mapper;

    /**
     * {@link EnhanceMapper} 具体使用查看ApiBoot官网文档http://apiboot.minbox.io/zh-cn/docs/api-boot-mybatis-enhance.html
     *
     * @param accountId {@link Account#getId()}
     * @param money     扣除的金额
     */
    public void deduction(Integer accountId, Double money) {
        Account account = mapper.selectOne(accountId);
        if (ObjectUtils.isEmpty(account)) {
            throw new RuntimeException("账户：" + accountId + "，不存在.");
        }
        if (account.getMoney() - money < 0) {
            throw new RuntimeException("账户：" + accountId + "，余额不足.");
        }
        account.setMoney(account.getMoney().doubleValue() - money);
        mapper.update(account);
    }
}
