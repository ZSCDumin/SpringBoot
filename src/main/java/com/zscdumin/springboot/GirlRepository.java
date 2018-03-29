package com.zscdumin.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ZSCDumin on 2018/3/29.
 * 作者邮箱：2712220318@qq.com
 */

public interface GirlRepository extends JpaRepository<Girl, Integer> {
    List<Girl> findByAge(Integer age);
}
