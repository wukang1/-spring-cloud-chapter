package org.minbox.chapter.seata;

import org.minbox.chapter.seata.openfeign.AccountClient;
import org.minbox.chapter.seata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户接口实现
 *
 * @author 恒宇少年
 */
@RestController
public class AccountController implements AccountClient {
    /**
     * 账户业务逻辑
     */
    @Autowired
    private AccountService accountService;

    @Override
    public void deduction(Integer accountId, Double money) {
        accountService.deduction(accountId, money);
    }
}
