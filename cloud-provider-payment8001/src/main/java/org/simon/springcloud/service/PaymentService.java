package org.simon.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.simon.clouddemo.domain.Payment;

import java.util.List;

/**
 * @Author: simon
 * @DATE： 2020-03-15
 * @Vesion 1.0
 * @Description:
 */
public interface PaymentService {
    int addPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

    List<Payment> listAll();

    List<Payment> listAllByPage(Integer pageNum, Integer pageSize);
}
