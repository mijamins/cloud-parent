package org.simon.springcloud.service.impl;

import org.simon.clouddemo.domain.Payment;
import org.simon.springcloud.dao.PaymentDao;
import org.simon.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: simon
 * @DATE： 2020-03-15
 * @Vesion 1.0
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        int flag = paymentDao.addPayment(payment);
        return flag;
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> listAll() {
        return paymentDao.listAll();
    }

    @Override
    public List<Payment> listAllByPage(Integer pageNum, Integer pageSize) {
        return paymentDao.listAllByPage(pageNum, pageSize);
    }
}
