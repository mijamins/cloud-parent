package org.simon.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.simon.clouddemo.domain.Payment;

import java.util.List;


/**
 * @Author: simon
 * @DATE： 2020-03-15
 * @Vesion 1.0
 * @Description:
 */
@Mapper
public interface PaymentDao {
    int addPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

    List<Payment> listAll();

    List<Payment> listAllByPage(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
