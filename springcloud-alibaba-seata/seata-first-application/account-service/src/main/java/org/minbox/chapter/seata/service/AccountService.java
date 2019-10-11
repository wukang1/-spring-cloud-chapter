package org.minbox.chapter.seata;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 账户业务逻辑处理
 *
 * @author 恒宇少年
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountService {
}
