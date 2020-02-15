package com.gmall.user.service.impl;

import com.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.user.pojo.UmsMemberReceiveAddress;
import com.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
       Example e = new Example(UmsMemberReceiveAddress.class);
       e.createCriteria().andEqualTo("memberId",memberId);
      //  UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
       // umsMemberReceiveAddress.setMemberId(memberId);
        //根据外键查询
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);
        return  umsMemberReceiveAddresses;
    }
}
