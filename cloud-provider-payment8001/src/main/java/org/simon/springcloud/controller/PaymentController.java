package org.simon.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.simon.clouddemo.domain.Payment;
import org.simon.clouddemo.entity.CommonResult;
import org.simon.clouddemo.entity.PageCommonResult;
import org.simon.clouddemo.util.PubConStant;
import org.simon.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: simon
 * @DATE： 2020-03-15
 * @Vesion 1.0
 * @Description:
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult addPayment(@RequestBody Payment payment){
        int flag = paymentService.addPayment(payment);
        log.info(" addPayment  flag="+flag);
        if(flag>0) {
            return new CommonResult(PubConStant.ERROR.getCode(),PubConStant.ERROR.getMessage());
        }
        return new CommonResult(PubConStant.SUCCESS.getCode(), PubConStant.SUCCESS.getMessage());
    }

    @GetMapping("/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("payment=" + paymentById);
        if (paymentById == null) {
            return new CommonResult(PubConStant.ERROR.getCode(), PubConStant.ERROR.getMessage());
        }
        return new CommonResult(PubConStant.SUCCESS.getCode(), PubConStant.SUCCESS.getMessage(), paymentById);

    }

    @RequestMapping
    public CommonResult listAll() {
        List<Payment> paymentList = paymentService.listAll();
        if (paymentList == null) {
            return new CommonResult(PubConStant.ERROR.getCode(), PubConStant.ERROR.getMessage());
        }
        return new CommonResult(PubConStant.SUCCESS.getCode(), PubConStant.SUCCESS.getMessage(), paymentList);

    }

    @RequestMapping("/{pageNum}/{pageSize}")
    public CommonResult listAllByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        List<Payment> paymentList = paymentService.listAllByPage(pageNum - 1, pageSize);
        if (paymentList == null) {
            return new CommonResult(PubConStant.ERROR.getCode(), PubConStant.ERROR.getMessage());

        }
        return new PageCommonResult(PubConStant.SUCCESS.getCode(), PubConStant.SUCCESS.getMessage(), paymentList, pageNum, pageSize);
    }

}
