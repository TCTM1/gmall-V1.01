package com.gmall.user.controller;

import com.gmall.pojo.UmsMemberReceiveAddress;
import com.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UmsMemberReceiveAddressController {
    @Autowired
    private UmsMemberReceiveAddressService userAddressService;

    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
            List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userAddressService.getReceiveAddressByMemberId(memberId);
            return umsMemberReceiveAddresses;
    }
}
