package com.gmall.user.service;

import com.gmall.user.pojo.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
