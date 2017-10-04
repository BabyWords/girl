package com.wujunwen.Repository;

import com.wujunwen.Domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Keven on 2017/10/3.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
