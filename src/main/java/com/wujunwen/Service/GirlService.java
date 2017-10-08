package com.wujunwen.Service;

import com.wujunwen.Domain.Girl;
import com.wujunwen.Enum.ResultEnum;
import com.wujunwen.Exception.GirlException;
import com.wujunwen.Repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Keven on 2017/10/4.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
         //返回：你还在上小学code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);

        } else if (age > 10 && age < 16) {
            //返回：你还在上初中code=101
            throw new GirlException(ResultEnum.MIDDLLE_SCHOOL);

        }
        //如果大于16岁，加钱
        //...
    }

    /**
     * 通过Id查询信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
