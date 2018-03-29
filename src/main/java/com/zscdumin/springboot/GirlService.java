package com.zscdumin.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZSCDumin on 2018/3/29.
 * 作者邮箱：2712220318@qq.com
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setId(3);
        girlA.setAge(18);
        girlA.setCupSize("BFF");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(27);
        girlB.setCupSize("C");
        girlRepository.save(girlB);
    }
}
